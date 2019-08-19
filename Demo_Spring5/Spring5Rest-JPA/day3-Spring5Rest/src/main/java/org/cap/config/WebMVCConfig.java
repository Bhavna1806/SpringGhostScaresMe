package org.cap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan("org.cap")
@EnableTransactionManagement
public class WebMVCConfig implements WebMvcConfigurer{
	

	@Bean
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factoryBean=
				new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("jpademo");
		return factoryBean;
	}
	
	@Bean
	public JpaTransactionManager getTransactionManagerBean() {
		JpaTransactionManager transactionManager=
				new JpaTransactionManager();
		transactionManager
			.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
		
		return transactionManager;
	}
	
}
