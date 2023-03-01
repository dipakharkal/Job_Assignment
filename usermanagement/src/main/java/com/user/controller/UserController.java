package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.Users;
import com.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService  userService;
	
	@PostMapping("/api/createUser")
	public String createUser(@RequestBody Users user)
	{
	return	userService.createUser(user);
		
	}
}
