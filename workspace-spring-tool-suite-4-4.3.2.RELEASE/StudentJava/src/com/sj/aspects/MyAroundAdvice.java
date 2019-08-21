package com.sj.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before Around advice invoked");
		System.out.println("while return");
		 long startTime = System.currentTimeMillis();
		arg0.proceed();
		 long endTime = System.currentTimeMillis();
		 System.out.println("Time taken to execute the method is: "+(endTime-startTime)+" milliseconds");
		System.out.println("after Around advice invoked");
		return null;
	}
}
