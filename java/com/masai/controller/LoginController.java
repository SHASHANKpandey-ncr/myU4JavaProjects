package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.LoginException;
import com.masai.exceptions.UserException;
import com.masai.model.LoginDTO;
import com.masai.model.User;
import com.masai.service.LoginService;

@RestController
public class LoginController {

	
	// all to be added to main
	
	@Autowired
	private LoginService userLogin;

	@PostMapping("/login")
	public ResponseEntity<String> logInUser(@Valid @RequestBody LoginDTO dto) throws LoginException {

		String result = userLogin.logIntoAccount(dto);

		return new ResponseEntity<String>(result, HttpStatus.OK);

	}

	@PostMapping("/logout")
	public String logoutUser(@RequestParam(required = false) String key) throws LoginException {
		return userLogin.logOutFromAccount(key);

	}

	@DeleteMapping("/delete")
	public String deleteAccount(@RequestParam String key, Integer userId) throws LoginException, UserException {
		return userLogin.deleteUser(key, userId);

	}

	@GetMapping("/get")
	public User getAccountDetails(@RequestParam String key, Integer userId) throws LoginException, UserException {

		return userLogin.getUser(key, userId);

	}

}
