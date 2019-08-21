package com.sj.aspects;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsExceptionAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception e) {
        System.out.println("This is from exception method");
     //   System.out.println(e);
	}
}
