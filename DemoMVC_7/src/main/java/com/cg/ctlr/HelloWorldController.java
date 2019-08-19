package com.cg.ctlr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
@RequestMapping("/hi")
public class HelloWorldController {
 
  @RequestMapping(value="/hello" ,method = RequestMethod.GET)
  public String hi(@RequestParam("name") String name, Model model) {
    String message = "Hi " + name + "!";
    model.addAttribute("message", message);
    return "success";
  }
 
}