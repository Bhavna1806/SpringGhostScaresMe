package com.cg.jdbc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cg.jdbc.bean.Employee;

public class EmployeeRowMapper  implements RowMapper {
	
	public Object mapRow(ResultSet rs, int line) throws SQLException 
	{
		Employee e = new Employee();
		e.setEid(rs.getInt(1));
		e.setEnm(rs.getString(2));
		e.setEsl(rs.getDouble(3));
		return e;
	}

	}



