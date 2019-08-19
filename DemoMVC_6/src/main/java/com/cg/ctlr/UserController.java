package com.cg.ctlr;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Scope("session")
@Controller
@RequestMapping(value="user")
public class UserController {
	
	ArrayList<String> cityList;
	ArrayList<String> skillList;
	
	@RequestMapping(value="/showLogin")
	public String prepareLogin(Model model)
	{
		System.out.println("In prepareLogin() method");
		model.addAttribute("login",new Login());
		return "login";
	}
	
	@RequestMapping(value="/checkLogin")
	public String checkLogin()
	{
		//Logic to validate userName and password against database
	  	return "loginSuccess";	
	}

	@RequestMapping(value="/showRegister")
	public String prepareRegister(Model model)
	{
		cityList =new ArrayList<String>();
		
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Chennai");
		cityList.add("Delhi");
		
		skillList =new ArrayList<String>();
		
		skillList.add("Java");
		skillList.add("Struts");
		skillList.add("Spring");
		skillList.add("Hibernate");
		
		model.addAttribute("cityList",cityList);
		model.addAttribute("skillList",skillList);
		
		model.addAttribute("user",new User());
	    return "register";	
	}
	
	@RequestMapping(value="/checkRegister")
	public String checkRegister(@ModelAttribute
			("user")
	@Valid User user,BindingResult result,
	Model model)
	{
		 if(result.hasErrors())
		 {
			 System.out.println("Error");
			 model.addAttribute("cityList",cityList);
    		 model.addAttribute("skillList",skillList);

			 return "register";
		 }
		 else
		 {
          model.addAttribute("user",user);  
          System.out.println("Valid  dd");
	  	  return "registerSuccess";	
		 }
	}
	 
	

}
