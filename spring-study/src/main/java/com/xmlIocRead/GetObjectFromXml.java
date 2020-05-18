package com.xmlIocRead;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.entity.Car;
import com.entity.MyClass;
import com.entity.MySingle;
import com.xmlIocRead.MyFactoryBean.CarFactoryBean;


/**
 * 追踪xml方式实例化java对象
 * 
 * 疑问 ClassLoader干吗用的
 */
public class GetObjectFromXml {
	public static void main(String[] args) {
		System.out.println("xxxxxxxxxxxxxxxx");
		
		ClassPathResource cpr = new ClassPathResource("config/bean.xml");
		
		XmlBeanFactory bf = new XmlBeanFactory(cpr);

		/**
		 * 以id形式:  获取单例bean 获取多例bean 获取嵌套bean
		 * 以class形式: 获取bean 
		 */
		MyClass mc = (MyClass) bf.getBean("mc");
		
//		MyClass mc =bf.getBean(MyClass.class);
//		MyClass mm = (MyClass)bf.getBean("myClass");
//		System.out.println("================================");
//		System.out.println(mc.person.myClass.cc);
		
		System.out.println("===========FactoryBean============");
//		Car car =  (Car) bf.getBean("car");
//		Car c = (Car) bf.getBean("car");
//		System.out.println(car.hashCode()+"======="+c.hashCode());
//		System.out.println(car.brand+"=="+car.maxSpeed+"======="+car.getPrice());
		
		MySingle ms = (MySingle) bf.getBean("mySingle");
		System.out.println(ms.getName());
		
		
	}
}
