package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootDemoApplication.class, args);
		Employee e1=(Employee) context.getBean("emp");
		Employee e2=(Employee) context.getBean("emp");
		System.out.println(e1);
	}

}
