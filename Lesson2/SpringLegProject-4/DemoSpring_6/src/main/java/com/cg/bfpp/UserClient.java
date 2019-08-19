package com.cg.bfpp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("user.xml");
		User user = (User) ctx.getBean("user");
		System.out.println(user.getUsername());
		
		//XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource("user.xml"));
		//PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();
		//cfg.setLocation(new FileSystemResource("user.properties"));
		//cfg.postProcessBeanFactory(factory);
		//User user = (User) ctx.getBean("user");
		//System.out.println(user.getUsername());			
	}
}
