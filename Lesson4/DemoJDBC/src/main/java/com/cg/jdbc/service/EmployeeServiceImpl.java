package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.Employee;
import com.cg.jdbc.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao;
		
	public void setDao(EmployeeDao dao) 
	{
		this.dao = dao;
	}

	public List getAll()
	{
		// TODO Auto-generated method stub
		return dao.getAll();
	}


	public int getCount() {
		// TODO Auto-generated method stub
		return dao.getCount();
	}


	public Employee getEmpByEid(int eid) {
		// TODO Auto-generated method stub
		return dao.getEmpByEid(eid);
	}


	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return dao.getEmployeeList();
	}

	
	public String getEmployeeName(int eid) {
		// TODO Auto-generated method stub
		return dao.getEmployeeName(eid);
	}


	public int insertRec(int eid, String enm, double esl) {
		// TODO Auto-generated method stub
		return dao.insertRec(eid, enm, esl);
	}


	public int updateRec(int eid, String enm, double esl) {
		// TODO Auto-generated method stub
		return dao.updateRec(eid, enm, esl);
	}

}
