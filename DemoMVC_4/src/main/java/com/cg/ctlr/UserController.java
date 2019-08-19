package com.cg.ctlr;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Scope("session")
@Controller
@RequestMapping(value="user")
public class UserController {
	
	@RequestMapping(value="showLogin")
	public String prepareLogin(Model model)
	{
		System.out.println("In prepareLogin() method");
		model.addAttribute("login",new Login());
		return "login";
	}
	
	@RequestMapping(value="checkLogin")
	public String checkLogin()
	{
		//Logic to validate userName and password against database
	  	return "loginSuccess";	
	}

	@RequestMapping(value="showRegister")
	public String prepareRegister(Model model)
	{
		model.addAttribute("user",new User());
	    return "register";	
	}
	
	@RequestMapping(value="checkRegister")
	public String checkRegister(User user ,Model model)
	{
          model.addAttribute("user",user);  		  
	  	  return "registerSuccess";	
	}
	 
	

}
