package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.Employee;
import com.cg.jdbc.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao;
		
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dao.getCount();
	}

	@Override
	public Employee getEmpByEid(int eid) {
		// TODO Auto-generated method stub
		return dao.getEmpByEid(eid);
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return dao.getEmployeeList();
	}

	@Override
	public String getEmployeeName(int eid) {
		// TODO Auto-generated method stub
		return dao.getEmployeeName(eid);
	}

	@Override
	public int insertRec(int eid, String enm, double esl) {
		// TODO Auto-generated method stub
		return dao.insertRec(eid, enm, esl);
	}

	@Override
	public int updateRec(int eid, String enm, double esl) {
		// TODO Auto-generated method stub
		return dao.updateRec(eid, enm, esl);
	}

}
