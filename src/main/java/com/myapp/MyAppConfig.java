package com.myapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.myapp.dao.UserDao;
import com.myapp.daoImpl.UserDaoImpl;
import com.myapp.service.LoginControllerService;

@ComponentScan
@EnableAutoConfiguration

public abstract class MyAppConfig {

	@Autowired
	private DataSource datasource;
	
	@Autowired
	public LoginControllerService loginControllerService;

	
	@Bean
	public UserDao userDao(){
		return new UserDaoImpl();
	}


	
}
