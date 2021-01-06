package com.zou7al.spring.tut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
	
	@RequestMapping(value ="/")
	public String greeting() {
		return "Hello, Welcome to SpringBoot Again!";
		
	}
	
	@GetMapping(value ="/{name}")
	public String greetingWithName(@PathVariable String name) {
		return String.format("Welcome %s to our SpringBoot App", name);
		
		
	}

}
