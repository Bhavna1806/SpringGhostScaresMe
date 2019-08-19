package com.cg.intro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.cg.UserBean;



@ComponentScan("com.cg")
@EnableAutoConfiguration
@PropertySource("classpath:/user.properties")
//@SpringBootApplication
public class UserClient1 {

	public static void main(String args[]) throws Exception 
	{
		ApplicationContext context = 
				SpringApplication.run
				(UserClient1.class, args);
		UserBean user = (UserBean) 
				context.getBean("u");
		System.out.println(user.getUserId());
		System.out.println(user.getUsername());	
		System.out.println(user.getPassword());
	}
}
