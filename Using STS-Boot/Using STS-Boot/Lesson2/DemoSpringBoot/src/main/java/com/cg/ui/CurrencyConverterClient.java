package com.cg.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.anno.CurrencyConverter;
import com.cg.ui.Client;
import com.cg.ui.HelloWorld;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cg.anno")
@SpringBootApplication
public class CurrencyConverterClient {

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(CurrencyConverterClient.class, args);
		CurrencyConverter curr = (CurrencyConverter) context.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");     
	}
}