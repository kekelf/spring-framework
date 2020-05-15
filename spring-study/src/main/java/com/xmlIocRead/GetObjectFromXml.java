package com.xmlIocRead;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.entity.MyClass;


/**
 * 追踪xml方式实例化java对象
 * 
 * 疑问 ClassLoader干吗用的
 */
public class GetObjectFromXml {
	public static void main(String[] args) {
		System.out.println("xxxxxxxxxxxxxxxx");
		ClassPathResource cpr = new ClassPathResource("config/bean.xml");
		System.out.println(cpr.exists());
		XmlBeanFactory bf = new XmlBeanFactory(cpr);
		MyClass mc = (MyClass) bf.getBean("myClass");
//		MyClass mc =bf.getBean(MyClass.class);
//		MyClass mm = (MyClass)bf.getBean("myClass");
		System.out.println("================================");
		System.out.println(mc.person.name);
	}
}
