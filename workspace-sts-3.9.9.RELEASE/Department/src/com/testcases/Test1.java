package com.testcases;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.emp.Emp;

public class Test1 {

	public Test1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BeanFactory bf=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		 Emp e=(Emp)bf.getBean("employee");
		 System.out.println();
		 e.getDetails();
	}
}
