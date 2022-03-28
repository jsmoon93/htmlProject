package com.ishift.newb.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.ishift.newb.dao.CustomerDao;

@RestController
public class CustomerController {
	
//	@GetMapping("/test")
//	public String projectInfo() {
//		return "Project name is NewB.";
//	}
	
	@Resource
	private CustomerDao customerDao;
	
	
	
	
	
	
	
	
}
