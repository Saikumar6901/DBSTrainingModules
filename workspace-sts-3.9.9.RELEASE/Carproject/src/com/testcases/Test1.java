package com.testcases;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.car.Car;

public class Test1 {

	public Test1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AbstractApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
         Car c=(Car)ap.getBean("touristcar");
         System.out.println(c);
	}

}
