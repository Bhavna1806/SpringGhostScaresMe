package org.cap.boot;

import org.cap.config.JavaConfig;
import org.cap.pojo.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		AbstractApplicationContext context=
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee employee=(Employee)context.getBean("employee");
		Employee employee1=(Employee)context.getBean("employee");
		
		employee.setLastName("Jackson");
		System.out.println(employee);
		System.out.println(employee1);
		
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp);
		
	}

}
