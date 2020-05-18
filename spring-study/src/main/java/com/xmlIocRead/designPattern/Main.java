package com.xmlIocRead.designPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 获取器方法注入:当teacher这个实体的方法过时的时候
 * 只需要将xml中<lookup-method name="getBeanMethod" bean="teacher" ></lookup-method>
 * bean="student"就是可以调用student的showMe方法
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("lookup/lookup.xml");
		GetBeanTest gbt = (GetBeanTest) ac.getBean("getBeanTest");
		gbt.showMe();
		
	}
}
