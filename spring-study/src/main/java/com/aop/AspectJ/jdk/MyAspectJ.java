package com.aop.AspectJ.jdk;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *注解方式实现aop
 *
 */
@Aspect
public class MyAspectJ {
	
	@Pointcut("execution(* *.myShowAspectJ())")
	public void pointMethod() {
	}
	
	@Before("pointMethod()")
	public void addBeforeMethod() {
		System.out.println("AspectJ: addBeforeMethod...");
	}
	
	@After("pointMethod()")
	public void addAfterMethod() {
		System.out.println("AspectJ: addAfterMethod...");
	}
	
	@Pointcut("execution(* *.myAroundAspjectJ(..))")
	public void around() {}
	
	@Around("around()")
	public void aroundAspject(ProceedingJoinPoint p) {
		System.out.println("around before");
		
		try {
			p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("around end");
	}
}
