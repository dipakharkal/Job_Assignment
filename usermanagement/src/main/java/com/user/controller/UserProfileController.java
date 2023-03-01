package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.entities.UserProfile;
import com.user.service.UserProfileService;

public class UserProfileController {

	@Autowired
	UserProfileService userProfileService;
	
	@PostMapping("/api/createUserProfile")
	public String createUserProfile(@RequestBody UserProfile userProfile)
	{
		return userProfileService.createUserProfile(userProfile);
	}
}
