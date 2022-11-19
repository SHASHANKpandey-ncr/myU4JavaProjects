package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> userExceptionHandler(UserException ue, WebRequest req){
		
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(ue.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorDetails> loginExceptionHandler(LoginException le, WebRequest req){
		
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(le.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> validationExceptionHandler(MethodArgumentNotValidException me, WebRequest req){
		
		
		MyErrorDetails err= 
				new MyErrorDetails(LocalDateTime.now(), "validation error..!!", me.getBindingResult().getFieldError().getDefaultMessage());
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> otherExceptionHandler(Exception ee, WebRequest req){
		
		
		MyErrorDetails err= new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(ee.getMessage());
			err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	
}
