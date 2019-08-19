package com.cg.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cg")
//@SpringBootApplication
public class Client {

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(Client.class, args);
        HelloWorld bean = (HelloWorld) context.getBean(HelloWorld.class);
        String s=bean.sayHello();
        System.out.println(s);     
	}
}
