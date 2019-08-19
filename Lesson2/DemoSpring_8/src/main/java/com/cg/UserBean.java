package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("u")
public class UserBean {
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Value("${userid}")
	private int userId;
	@Value("${username}")
	//@Value("majrul")
	private String username;
	
	@Value("${password}")
	//@Value("majrul123")
	private String password;
		
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
