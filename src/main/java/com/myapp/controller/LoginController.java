package com.myapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.config.AuthenticationReqest;
import com.myapp.constants.UserInfo;
import com.myapp.service.LoginControllerService;

@RestController
@RequestMapping("/api/myapp")
@ComponentScan
public class LoginController {

	@Autowired
	private  LoginControllerService loginControllerService;
	


	 	   
@RequestMapping(value="/login",method={RequestMethod.POST},
consumes="application/json")
public @ResponseBody UserInfo login (@RequestBody AuthenticationReqest  authenticationReqest){

	
	UserInfo user=loginControllerService.login(authenticationReqest);
	return user;
	
}
	
	
}
