package com.masai.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.UserDao;
import com.masai.dao.SessionDao;
import com.masai.exceptions.LoginException;
import com.masai.exceptions.UserException;
import com.masai.model.CurrentUserSession;
import com.masai.model.User;
import com.masai.model.LoginDTO;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao uDao;

	@Autowired
	private SessionDao sDao;

	// **************************************************

	@Override
	public String logIntoAccount(LoginDTO dto) throws LoginException {

		User existingUser = uDao.findByMobileNo(dto.getMobileNo());

		if (existingUser == null) {

			throw new LoginException("Please Enter a valid mobile number");

		}

		Optional<CurrentUserSession> validUserSessionOpt = sDao.findById(existingUser.getUserId());

		if (validUserSessionOpt.isPresent()) {

			throw new LoginException("User already Logged In with this number");

		}

		if (existingUser.getPassword().equals(dto.getPassword())) {

			String key = RandomString.make(5);                

			CurrentUserSession currentUserSession = new CurrentUserSession(existingUser.getUserId(), key,
					LocalDateTime.now());

			sDao.save(currentUserSession);

			return currentUserSession.toString();
		} else
			throw new LoginException("Please Enter a valid password");

	}

	// **************************************************

	@Override
	public String logOutFromAccount(String key) throws LoginException {

		CurrentUserSession validUserSession = sDao.findByUuid(key);

		if (validUserSession == null) {
			throw new LoginException("User Not Logged In with this number");

		}

		sDao.delete(validUserSession);

		return "Logged Out..!!";

	}

	// **************************************************

	@Override
	public String deleteUser(String key, Integer userId) throws LoginException, UserException {
		// TODO Auto-generated method stub

		CurrentUserSession validUserSession = sDao.findByUuid(key);
		Optional<User> validUser = uDao.findById(userId);

		if (validUserSession == null) {
			throw new LoginException("Please enter correct key..!!");

		}
		if (validUser.isEmpty()) {
			throw new UserException("Please enter correct user id..!!");

		}

		if (validUserSession.getUserId() == validUser.get().getUserId()) {
			sDao.delete(validUserSession);
			uDao.delete(validUser.get());
		}

		return "Account deleted..!!";

	}

	// **************************************************

	@Override
	public User getUser(String key, Integer userId) throws LoginException, UserException {
		// TODO Auto-generated method stub
		User user=new User();
		CurrentUserSession validUserSession = sDao.findByUuid(key);
		Optional<User> validUser = uDao.findById(userId);

		if (validUserSession == null) {
			throw new LoginException("Please enter correct key..!!");

		}
		if (validUser.isEmpty()) {
			throw new UserException("Please enter correct user id..!!");

		}

		if (validUserSession.getUserId() == validUser.get().getUserId()) {
			user=validUser.get(); return user;
		}
		throw new UserException("Please enter correct user id..!!");
		
	}

}
