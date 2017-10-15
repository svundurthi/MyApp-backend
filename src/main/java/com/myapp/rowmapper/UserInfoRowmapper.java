package com.myapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.myapp.constants.UserInfo;

public class UserInfoRowmapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserInfo user=new UserInfo();
		user.setUserKey(rs.getString("userKey"));
		user.setEmail(rs.getString("email"));
		user.setPhone(rs.getString("phone"));
		user.setUsername(rs.getString("username"));
		user.setRole(rs.getString("role"));
		
		return user;
	}
	

}
