package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.entity.MyClass;

@RestController
public class Test {
		public static void main(String[] args) {
			System.out.println("xxxxxxxxxxxxxxxx");
			/**
			 * 将xml路径上的\改为/,得到一个ClassLoader实体
			 */
			ClassPathResource cpr = new ClassPathResource("config\\bean.xml");
			System.out.println(cpr.exists());
			System.out.println(cpr);
			XmlBeanFactory bf = new XmlBeanFactory(cpr);
			MyClass mc = (MyClass) bf.getBean("myClass");
			System.out.println(mc);
			System.out.println("================================");
			System.out.println(mc.cc);
		}

}
