package com.container;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.container.beanFactoryPostProcessor.SimplePostProsessor;
import com.entity.Car;
import com.entity.MyXmlDate;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("container/container.xml");
		Car car = (Car)ac.getBean("car");
		System.out.println(car.brand);
		
		System.out.println("===============注入Date属性============");
		MyXmlDate mxd =  (MyXmlDate)ac.getBean("myXmlDate");
		System.out.println(mxd.getDateValue());
		
		System.out.println("==============BeanFactoryPostProccessor=========");
		ConfigurableListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryPostProcessor/beanPostProcessor.xml"));
		BeanFactoryPostProcessor bfpp=(BeanFactoryPostProcessor) bf.getBean("bfpp");
		bfpp.postProcessBeanFactory(bf);
		SimplePostProsessor spp =  (SimplePostProsessor)bf.getBean("simpleBean");
		System.out.println(spp.getConnectionString()+"========"+spp.getPassword()+"======"+spp.getUserName());
		
		
		
		
	}
}
