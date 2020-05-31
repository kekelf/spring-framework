package com.aop.AspectJ.jdk;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public interface TestAspectJInterface{
	
	public void myShowAspectJ();

	public void myAroundAspjectJ(String str);
	
}
