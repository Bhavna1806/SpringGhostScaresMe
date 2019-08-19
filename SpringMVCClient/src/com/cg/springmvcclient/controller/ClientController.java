package com.cg.springmvcclient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cg.springmvcclient.bean.Employee;

@Controller
public class ClientController {

	@RequestMapping("home")
	public String showHome(Model model) {
		System.out.println("In show home");
		RestTemplate rt = new RestTemplate();
		String uri = "http://localhost:8081/SpringWithAngular/rest/employee";
		List<Employee> list =
		rt.getForObject(uri,List.class);
		System.out.println("output:"+list);
		model.addAttribute("elist", list);
		model.addAttribute("emp", new Employee());
		return "Home";
	}
	@RequestMapping("add")
	public String addEmployee(@ModelAttribute("emp")Employee emp, Model model) {
		RestTemplate rt = new RestTemplate();
		String uri = "http://localhost:8081/SpringWithAngular/rest/employee/create/";
		List<Employee> list =
		rt.postForObject(uri, emp, List.class);
		model.addAttribute("elist", list);
		model.addAttribute("emp", new Employee());
		System.out.println("Added");
		return "Home";
	}
}
