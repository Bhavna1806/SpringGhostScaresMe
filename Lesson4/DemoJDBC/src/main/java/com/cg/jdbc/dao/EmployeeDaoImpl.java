package com.cg.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.jdbc.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	JdbcTemplate jdbcTemplate;


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getCount()
	{
		java.math.BigDecimal count=new java.math.BigDecimal(0) ;
		count=(java.math.BigDecimal)(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM employees",Object.class));
		return count.intValue();
	}

	public String getEmployeeName(int eid)
	{
		String sql = "SELECT ename FROM employees WHERE eid=?";
		Object[] params=new Object[]{eid};
		String name=(String)(getJdbcTemplate().queryForObject(sql,params,String.class));
		return name;
	}

	public int insertRec(int eid,String enm,double esl)
	{
		String sql="INSERT INTO employees VALUES(?,?,?)";   
		Object[] params=new Object[]{eid,enm,esl};
		return jdbcTemplate.update(sql, params);
	}

	public int updateRec(int eid,String enm,double esl)
	{
		String sql="UPDATE employees SET ename=?,esal=? WHERE eid=?";
		Object[] params = new Object[]{enm,esl,eid};
		int update=jdbcTemplate.update(sql, params);
		return update;
	}

	public List getAll()
	{
		Object[] params=new Object[]{new Double(40000.00)};
		List list=jdbcTemplate.queryForList
				("SELECT * FROM employees WHERE esal > ?",params);
		return list;
	}

	// to retrieve the an employees given eid
	public Employee getEmpByEid(int eid) {

		Object[] params=new Object[]{new Integer(eid)};
		String sql = "SELECT eid,ename,esal FROM employees WHERE eid=?";
		Employee employees= (Employee) jdbcTemplate.queryForObject(sql,params,new EmployeeRowMapper());
		return employees;

	}

	public List<Employee> getEmployeeList() 
	{
		String sql = "SELECT * FROM employees where esal>?";
		Object[] params=new Object[]{new Integer(4000)};
		List<Employee> eList =jdbcTemplate.query(sql,params,new EmployeeRowMapper());
		return eList;
	}
}
