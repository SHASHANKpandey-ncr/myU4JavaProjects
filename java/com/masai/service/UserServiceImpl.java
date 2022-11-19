package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.UserDao;
import com.masai.dao.SessionDao;
import com.masai.exceptions.UserException;
import com.masai.model.CurrentUserSession;
import com.masai.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao uDao;

	@Autowired
	private SessionDao sDao;

	// **********************************************************

	@Override
	public User createUser(User user) throws UserException {

		User existingUser = uDao.findByMobileNo(user.getMobileNo());

		if (existingUser != null)
			throw new UserException("User Already Registered with Mobile number");

		return uDao.save(user);

	}

	// **********************************************************

	@Override
	public User updateUser(User user, String key) throws UserException {

		CurrentUserSession loggedInUser = sDao.findByUuid(key);

		if (loggedInUser == null) {
			throw new UserException("Please provide a valid key to update a customer");
		}

		if (user.getUserId() == loggedInUser.getUserId()) {
			// If LoggedInUser id is same as the id of supplied User which we want to update
			return uDao.save(user);
		} else
			throw new UserException("Invalid User Details, please login first");

	}

	@Override
	public User createUserAc(User user) throws UserException {
		User existingUser = uDao.findByMobileNo(user.getMobileNo());

		if (existingUser != null)
			throw new UserException("User Already Registered with Mobile number");

		return uDao.save(user);
	}

	// **********************************************************

}
