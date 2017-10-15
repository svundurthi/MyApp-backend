package com.myapp.daoImpl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.myapp.constants.UserInfo;
import com.myapp.dao.UserDao;
import com.myapp.properties.UserProperties;
import com.myapp.rowmapper.UserInfoRowmapper;

@Repository
@Configuration
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	
	@Autowired
	private DataSource datasource;
	
	@Autowired
	public  UserProperties userproperties;
	
	 @Autowired
	 private transient NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	 
	 /**
	  * @param namedParameterJdbcTemplate the namedParameterJdbcTemplate to set
	  */
	 public void setNamedParameterJdbcTemplate(final NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
	  this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	 }
	 private transient MapSqlParameterSource namedSqlParams;
	 
	 @PostConstruct
	 private void initialize(){
		 setDataSource(datasource);
	 }
	 
	@Override
	public UserInfo loadUserByUsername(String username) throws EmptyResultDataAccessException {
		
		UserInfo userinfo=new UserInfo();
		namedSqlParams=new MapSqlParameterSource();
		namedSqlParams.addValue("username", username);
		
		try {
			userinfo=(UserInfo)namedParameterJdbcTemplate.queryForObject(
					userproperties.getGetUser(), namedSqlParams, new UserInfoRowmapper());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		
		return userinfo;
		
	}

}
