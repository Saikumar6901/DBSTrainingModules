package com.testpackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.helloworld.Helloconstrc;

public class Test2 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BeanFactory bean= new XmlBeanFactory(new ClassPathResource("hellobean.xml"));
      Helloconstrc hc=(Helloconstrc)bean.getBean("construcbean");
      hc.sayHi();
	}

}
