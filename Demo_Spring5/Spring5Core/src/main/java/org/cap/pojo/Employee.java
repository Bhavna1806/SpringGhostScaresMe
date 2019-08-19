package org.cap.pojo;

import java.util.List;
import java.util.Map;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	private Address address;
	
	/*private List<Address> address;*/
	
/*	private List<String> address;
	
	private Map<Integer, Address> maps;*/
	
	public Employee() {
		System.out.println("Employee Class - no args ");
	}
	
	public Employee(int employeeId, String firstName, String lastName, double salary, Address address) {
		super();
		System.out.println("Employee Class -Overloaded constructor - 5 args ");
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
	}
/*	public Employee(int employeeId, String firstName, String lastName, double salary, List<String> address) {
		super();
		System.out.println("Employee Class -Overloaded constructor - 5 args ");
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
	}*/
	
	
	
	/*public Employee(int employeeId, String firstName, String lastName, double salary, List<String> address,
			Map<Integer, Address> maps) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
		this.maps = maps;
	}*/
	
	
	
	public void emp_init() {
		System.out.println("employee initialized......");
	}
	
	
	public void emp_destroy() {
		System.out.println("employee destroyed......");
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	/*public Map<Integer, Address> getMaps() {
		return maps;
	}

	public void setMaps(Map<Integer, Address> maps) {
		this.maps = maps;
	}*/

	/*public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
*/
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Employee Class -setAddress method ");
		this.address = address;
	}*/
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	

}
