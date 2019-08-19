package com.cg.jdbc.utility;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:oracle.properties")
@Profile("dev")
public class DatabaseConfig {
	
	@Value("${db.driver}")
	public String driver;
	@Value("${db.url}")
	public String url;
	@Value("${db.user}")
	public String username;
	@Value("${db.password}")
	public String password;

	@Bean
	@Qualifier("myDataSource")
	public DataSource createDataSource()
	{
		DriverManagerDataSource dms=new DriverManagerDataSource();
		dms.setDriverClassName(driver);
		//dms.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dms.setUrl(url);
		dms.setUsername(username);
		dms.setPassword(password);
		return dms;
		
	}
	
}

