package com.container.myClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Car;

public class TestMyClassPathXmlApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new MyClassPathXmlApplicationContext("container/container.xml");
		Car car =  (Car)ac.getBean("car");
		System.out.println(car.brand);
	}
}
