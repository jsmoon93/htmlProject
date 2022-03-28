package com.ishift.newb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class NewbApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewbApplication.class, args);
	}

}
