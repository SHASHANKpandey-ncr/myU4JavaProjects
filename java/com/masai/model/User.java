package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer userId;
	
	@NotBlank
	private String name;
	
	
	@Size(min=10,max=10,message = "Mobile number is invalid")
	@NotBlank
	private String mobileNo;
	
	
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,100}$",message = "Please enter a valid password which include upperCase lowerCase specialCharector number and character between 6 to 12")
	@NotBlank
	private String password;
	
	@Email(message = "Please enter valid Email address")
	@NotBlank
	private String email;
	
	
}
