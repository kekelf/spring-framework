package com.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext ("listener/listener.xml"); 
			TestEvent event = new TestEvent("test Event","监听");
			context.publishEvent(event);
	}
}
