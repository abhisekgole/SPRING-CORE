package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserDetailsBO;

@Repository("authDAo")
public class AuthenticationDAOImpl implements AuthenticationDAO {
	
	private static final String AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE USERID=? AND PASS=?";

	@Autowired
	private JdbcTemplate template;




	public int validate(UserDetailsBO bo) {
		int count=0;
		count=template.queryForObject(AUTH_QUERY, Integer.class,bo.getUsername(), bo.getPassword());
		return count;
	}

}
