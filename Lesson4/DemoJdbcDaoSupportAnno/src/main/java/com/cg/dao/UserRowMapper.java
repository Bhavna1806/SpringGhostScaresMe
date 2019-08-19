package com.cg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cg.bean.User;

public class UserRowMapper implements RowMapper {
    public Object mapRow(ResultSet rs, int index) throws SQLException {
      User user=new User();
      user.setUsername(rs.getString(1));
      user.setPassword(rs.getString(2));
     
      return user;
    }      
  }