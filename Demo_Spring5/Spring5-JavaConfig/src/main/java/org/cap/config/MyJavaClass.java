package org.cap.config;

import org.cap.pojo.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyJavaClass {


	@Bean(name="emp")
	public Employee getEmployeeBean() {
		Employee employee=new Employee();
		employee.setEmployeeId(12345);
		employee.setFirstName("Tim");
		employee.setLastName("paul");
		employee.setSalary(4500);
		
		return employee;
	}
}
