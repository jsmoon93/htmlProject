package com.ishift.newb.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ishift.newb.service.CustomerService;
import com.ishift.newb.vo.CustomerVO;

@RestController
public class CustomerController {
	
//	@GetMapping("/test")
//	public String projectInfo() {
//		return "Project name is NewB.";
//	}
	
	@Resource
	private CustomerService customerService;
	
	@RequestMapping(value="/", method={RequestMethod.GET})
	public void test() {
		
		System.out.println("HELLO");
		
		if (customerService.getName() != null) {
			System.out.println(customerService.getName());
		} else {
			System.out.println("빈 값");
		}
		
	}
	
	
	
	
	
	
	
	
}
