package com.aop.AspectJ.cglib;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class TestAspectJ{
	
	public void myShowAspectJ() {
		System.out.println("进入我的方法");
	}

	public void myAroundAspjectJ(String str) {
		System.out.println("循环方法: "+str);
	}
	
}
