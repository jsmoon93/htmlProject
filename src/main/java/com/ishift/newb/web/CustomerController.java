package com.ishift.newb.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("/test")
	public String projectInfo() {
		return "Project name is NewB.";
	}
	
	
	
	
	
	
}
