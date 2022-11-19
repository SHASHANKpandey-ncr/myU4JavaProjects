package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.UserException;
import com.masai.model.User;
import com.masai.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService cService;

	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user) throws UserException {

		User savedCustomer = cService.createUser(user);

		return new ResponseEntity<User>(savedCustomer, HttpStatus.CREATED); // keep original
	}

	@PutMapping("/user")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user, @RequestParam(required = false) String key)
			throws UserException {

		User updatedUser = cService.updateUser(user, key);

		return new ResponseEntity<User>(updatedUser, HttpStatus.OK); // change Main

	}
	
	@PostMapping("/userac")
	public ResponseEntity<User> createUserAcHandler(@Valid @RequestBody User user,@RequestParam String name,String namemobileNo,String password,String email) throws UserException{
		
		user.setEmail(email); user.setMobileNo(namemobileNo);
		user.setName(name); user.setPassword(password);
		
		User savedUser = cService.createUser(user);

		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
		// for testing purpose only, contains bug..!!
	}
	

}
