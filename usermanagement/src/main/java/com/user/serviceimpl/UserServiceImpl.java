package com.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entities.Users;
import com.user.repositories.UserRepository;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public String createUser(Users user) {
	String message=null;
	if(user!=null)
	{
		userRepository.save(user);
		message="user saved successfully!";
	}
	return message;	
	}

}
