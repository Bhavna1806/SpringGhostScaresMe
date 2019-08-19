package com.cg.ctrl;

import java.util.Date;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res)
	{
	    String today = new Date().toString();	
		return new ModelAndView("hello","today",today);
	}

}
