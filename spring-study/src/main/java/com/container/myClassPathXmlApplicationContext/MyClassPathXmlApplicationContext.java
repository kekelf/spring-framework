package com.container.myClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext{

	public MyClassPathXmlApplicationContext(String...configLocations) {
		super(configLocations);		
	}
	
	protected void initPropertySources() {
		System.out.println("自定义ClassPathXmlApplicationContext  覆盖initPropertySource方法");
	}
	
}
