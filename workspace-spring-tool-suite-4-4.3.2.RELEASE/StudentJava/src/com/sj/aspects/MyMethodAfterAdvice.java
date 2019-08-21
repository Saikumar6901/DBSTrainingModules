package com.sj.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyMethodAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(arg0); // target class path of method
		System.out.println(arg1); // method to be invoked
		System.out.println(arg2); // 
		System.out.println(arg3); // return value
		System.out.println("method after advice... :) :) :)");	
	}

}
