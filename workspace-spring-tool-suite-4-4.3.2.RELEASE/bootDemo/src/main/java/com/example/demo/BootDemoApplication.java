package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoApplication {

	public static void main(String[] args) {
		
		Employee e = (Employee)SpringApplication.run(BootDemoApplication.class, args).getBean("emp");
		System.out.println(e);
	}

}
