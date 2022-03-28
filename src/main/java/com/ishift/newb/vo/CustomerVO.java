package com.ishift.newb.vo;

import lombok.Builder;

public class CustomerVO {

	private String customerName;
	private String customerAddress;
	
	@Builder
	public CustomerVO(String custName, String customerAddress) 
	{
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
}
