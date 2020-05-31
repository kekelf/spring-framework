package com.intercept.jdk;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("intercept/intercept.xml"));
		IService hello = (IService) factory.getBean("aopService");
//		hello.withAop();
		hello.withoutAop();
	}
}
