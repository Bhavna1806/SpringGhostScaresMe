package com.cg.ctrl;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//http://localhost:8080/pname/MyCtrl/hello.obj
@Controller
//@RequestMapping("MyCtrl")
public class MyController {
	
	//@RequestMapping(value="/hello",method=RequestMethod.GET)
	@RequestMapping("/hello")
	//http://localhost:8080/pname/hello.obj
	public ModelAndView sayHello()
	{
	   String today=new Date().toString();
	   return new ModelAndView("hello","today",today);
	}
	
	@RequestMapping("/hello1")
	//http://localhost:8080/pname/hello1.obj
	public ModelAndView sayMsg()
	{
	   return new ModelAndView("hello","today","Welcome");
	}

}
