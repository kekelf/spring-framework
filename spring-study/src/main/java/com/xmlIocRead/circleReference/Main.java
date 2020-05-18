package com.xmlIocRead.circleReference;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sun.xml.bind.v2.util.XmlFactory;

/**
 *循环依赖：
 * 	A类中有B属性，B类中有C属性，C类中有A属性
 *解决方法：
 *	注入属性的时候，通过get/set方法注入，不用构造器注入
 *为什么能够达到这种效果呢:
 *	
 */
public class Main {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("circleReference/circleReference.xml");
		ClassPathResource cpr = new ClassPathResource("circleReference/circleReference.xml");
		XmlBeanFactory xbf = new XmlBeanFactory(cpr);
		TestA ta = (TestA) xbf.getBean("a",TestA.class);
		System.out.println(ta.getTestB().getSex());

		
	}
}
