package com.ishift.newb.vo;

import org.apache.ibatis.type.Alias;

import lombok.Builder;

@Alias("custvo")
public class CustomerVO {

	private String customerName;
	private String customerAddress;
	
	@Builder
	public CustomerVO(String customerName, String customerAddress) 
	{
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
}
