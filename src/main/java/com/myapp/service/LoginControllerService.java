package com.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.config.AuthenticationReqest;
import com.myapp.constants.UserInfo;
import com.myapp.dao.UserDao;


@Service("loginControllerService")
public class LoginControllerService {
	
	@Autowired
	public UserDao userDao;

	
	public UserInfo  login(AuthenticationReqest authenticationReqest) {		
		
		return  userDao.loadUserByUsername(authenticationReqest.getUsername());
	}

}
