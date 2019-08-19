package com.cg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.cg.bean.User;

@Repository("userDao")
public class UserDaoImpl  extends JdbcDaoSupport implements UserDaoIntf {	
	@Autowired
	private DataSource myDataSource;
	@PostConstruct
	private void initialize() {
	setDataSource(myDataSource);
	}

	@Override
	public List<User> displayUsers() {
		List<User> users=getJdbcTemplate().query("select * from users", new UserRowMapper());
		return users;
	}
	

}
