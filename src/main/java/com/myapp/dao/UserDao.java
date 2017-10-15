package com.myapp.dao;

import com.myapp.constants.UserInfo;

public interface UserDao {

	public UserInfo loadUserByUsername(String username);
}
