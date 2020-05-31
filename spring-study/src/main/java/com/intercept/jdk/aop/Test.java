package com.intercept.jdk.aop;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.intercept.jdk.IService;

public class Test {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("intercept/jdkAop.xml"));
        Calculator aopService = (Calculator) factory.getBean("aopService");
        aopService.withoutAop();
       
    }
}
