package org.cap.config;

import org.cap.pojo.Address;
import org.cap.pojo.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(value= {MyJavaClass.class})
public class JavaConfig {

	@Bean(name="address2")
	public Address getAddressBean() {
		Address address=new Address();
			address.setStreetName("West Avvenue");
			address.setCity("Bangaluru");
		return address;
	}
	
	@Bean(name="address")
	public Address getAddressBean1() {
		Address address=new Address();
			address.setStreetName("North Avvenue");
			address.setCity("Chennai");
		return address;
	}
	
	@Bean(name="employee")
	@Scope(value="prototype")
	public Employee getEmployeeObj() {
		Employee employee=new Employee();
		employee.setEmployeeId(1001);
		employee.setFirstName("Tom");
		employee.setLastName("Jack");
		employee.setSalary(34000);
		
		return employee;
	}
}
