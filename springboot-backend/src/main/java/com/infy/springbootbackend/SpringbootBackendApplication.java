package com.infy.springbootbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.infy.springbootbackend.controller.EmployeeController;

@SpringBootApplication
//@ComponentScan(basePackageClasses=EmployeeController.class)
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}



