package com.cg;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class CurrencyListClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res = new ClassPathResource("collection.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		CurrencyList curr = (CurrencyList)factory.getBean("currencyList");
		List curs = curr.getCurrList();
		System.out.println(curs);
	
	}

}
