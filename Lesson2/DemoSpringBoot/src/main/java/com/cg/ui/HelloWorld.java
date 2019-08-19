package com.cg.ui;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component("hello")
//@SpringBootApplication
public class HelloWorld {
	public String sayHello()
	{
		return "Hello";
	}
}
