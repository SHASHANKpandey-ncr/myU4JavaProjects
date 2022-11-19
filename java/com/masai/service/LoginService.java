package com.masai.service;

import com.masai.exceptions.LoginException;
import com.masai.exceptions.UserException;
import com.masai.model.LoginDTO;
import com.masai.model.User;

public interface LoginService {
	
	public String logIntoAccount(LoginDTO dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;
	
	public String deleteUser(String key, Integer userId)throws LoginException, UserException;

	public User getUser(String key, Integer userId)throws LoginException, UserException;

	
}
