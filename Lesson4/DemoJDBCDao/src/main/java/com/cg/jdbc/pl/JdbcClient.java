package com.cg.jdbc.pl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.jdbc.bean.Employee;
import com.cg.jdbc.service.EmployeeService;

public class JdbcClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("spring.profiles.active", "oracle1");
		ApplicationContext bf = new ClassPathXmlApplicationContext("jdbc.xml");
		EmployeeService service = (EmployeeService) bf
				.getBean("employeeService");

		/*
		 * //execute queryForInt int count=service.getCount();
		 * System.out.println("No of Employees in the table :"+count);
		 * 
		 * 
		 * String name=service.getEmployeeName(101);
		 * System.out.println("Name "+name);
		 * 
		 * 
		 * 
		 * //execute update (insert new record) int
		 * insert=service.insertRec(1105,"test",55555.55); if(insert>0)
		 * System.out.println("Insert Success"); else
		 * System.out.println("Insert Failed");
		 * 
		 * List list=service.getAll(); System.out.println("List of Records");
		 * for(Object emp:list) { //Employee e=(Employee)emp;
		 * System.out.println(emp); }
		 * 
		 * 
		 * List<Employee> eList=service.getEmployeeList();
		 * System.out.println("List of Employees"); for(Employee e:eList)
		 * System.out.println(e.getEid()+" "+e.getEnm()+" "+e.getEsl());
		 * 
		 * 
		 * //execute update (modify) int update=service.updateRec(1102,
		 * "Shiv Kumar", 77777.77); if(update>0)
		 * System.out.println("Update Success"); else
		 * System.out.println("Update Failed");
		 * 
		 * 
		 * 
		 * 
		 * //execute QueryForList List list=service.getAll();
		 * System.out.println("List of Records"); for(Object emp:list)
		 * System.out.println(emp);
		 * 
		 * 
		 * Employee employee=service.getEmpByEid(101);
		 * System.out.println("Employee Info");
		 * System.out.println("EID :"+employee.getEid());
		 * System.out.println("ENM :"+employee.getEnm());
		 * System.out.println("ESL :"+employee.getEsl());
		 */

		List<Employee> eList = service.getEmployeeList();
		System.out.println("List of Employees");
		for (Employee e : eList)
			System.out.println(e.getEid() + " ||||" + e.getEnm() + " "
					+ e.getEsl());

	}

}
