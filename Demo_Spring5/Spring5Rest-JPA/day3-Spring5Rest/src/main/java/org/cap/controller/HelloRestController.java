package org.cap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

	@RequestMapping(value="/hello")
	public String sayHello() {
		return "Hello World! from Spring Framework!";
	}
}
