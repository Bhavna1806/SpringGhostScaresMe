package com.cg.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/c1")
public class LoginController {
	@RequestMapping("/mylogin")
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String username="iLearn";
		return new ModelAndView("success","uname",username);
	}
	@RequestMapping("/login")
	public ModelAndView myRequest(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		
		String username="iLearn";
		return new ModelAndView("success","uname",username);
	}

	@RequestMapping(value="/showPage", method=RequestMethod.GET)
	public String showPage(Model model) throws Exception {
		
		String username="cg";
		model.addAttribute("uname",username);
		return "success";
	}
	@RequestMapping("/servlet1")
	public String test(@RequestParam("name") String n,
		@RequestParam("pwd") String pass,Model m)
	{
		m.addAttribute("uname",n);
		return "success";
	}
}

