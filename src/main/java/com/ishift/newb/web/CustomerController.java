package com.ishift.newb.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ishift.newb.service.CustomerService;

@RestController
public class CustomerController {
		
	@Resource
	private CustomerService customerService;
	
	@RequestMapping(value="/kkh", method={RequestMethod.GET})
	public void test() {
		
		System.out.println("HELLO");
		
		if (customerService.getName() != null) {
			System.out.println(customerService.getName());
		} else {
			System.out.println("빈 값");
		}
		
	}
	

	
	
	
	
	
	
}
