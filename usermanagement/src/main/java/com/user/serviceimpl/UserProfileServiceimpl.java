package com.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.entities.UserProfile;
import com.user.repositories.UserProfileRespository;
import com.user.service.UserProfileService;

public class UserProfileServiceimpl implements UserProfileService {
	
@Autowired
UserProfileRespository userProfileRespository;

@Override
public String createUserProfile(UserProfile userProfile) {
	String message=null;
	if (userProfile!=null)
	{
		userProfileRespository.save(userProfile);
		message="user saved successfully";
	}
	return message;
	
}

}
