package com.xmlIocRead.constructor;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.entity.ConstructorA;
import com.entity.ConstructorB;
import com.entity.ConstructorC;
/**
 *区别如何狗在实体的属性：
 *	1.通过构造器
 *  2.通过get set方式 
 *
 */
public class ConstructorXmlOrGetSet {
	
	public static void main(String[] args) {
		ConstructorXmlOrGetSet cx = new ConstructorXmlOrGetSet();
//		cx.constructorConstructorB();
		cx.getSetPerprotype();
	}

	/**
	 * 通过构造器注入实体对应的属性
	 */
	public void constructorConstructorB() {
		ClassPathResource cpr = new ClassPathResource("constructor/constructor.xml");
		XmlBeanFactory xbf = new XmlBeanFactory(cpr);
		ConstructorA ca = (ConstructorA) xbf.getBean("ca");
		System.out.println(ca.cb.age);
		
	}
	
	public void getSetPerprotype() {
		ClassPathResource cpr = new ClassPathResource("constructor/constructor.xml");
		XmlBeanFactory xbf = new XmlBeanFactory(cpr);
		ConstructorC cc = (ConstructorC) xbf.getBean("cc");
		System.out.println(cc.getSex());
	}
}
