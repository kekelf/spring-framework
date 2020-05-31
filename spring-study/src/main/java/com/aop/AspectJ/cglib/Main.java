package com.aop.AspectJ.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xmlIocRead.circleReference.TestA;

/**
 * 面向切面编程案例
 * 静态代理，代理类直接用java代码写出来
 * jdk，接口的动态代理，代理类实现接口，并且利用反射创建代理类
 * cglib动态代理，代理类是被代理类的子类
 */
public class Main {
	public static void main(String[] args) {
		////将cglib代理类生成到d:\\code目录下
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("aop/AspectJ/cglib/aop.xml");
		TestAspectJ taa = new TestAspectJ();
		TestAspectJ ta = (TestAspectJ)ac.getBean("testAspectJ");
		ta.myShowAspectJ();
		
		
		
//		System.out.println("=======");
//		ta.myAroundAspjectJ("曹雪坤");
//		System.out.println("=============分割====================");
//		taa.myAroundAspjectJ("中国");
	}
}
