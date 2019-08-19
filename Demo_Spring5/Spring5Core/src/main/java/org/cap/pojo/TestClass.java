package org.cap.pojo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("demoBean.xml");
		
		Employee employee=(Employee)context.getBean("emp");
		//System.out.println(employee.getMaps());
		System.out.println(employee);
		
		context.registerShutdownHook();
		
	}

}
