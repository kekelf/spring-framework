package com.container.beanPostProcessorCase;

import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryPostProcessor/beanPostProcessonCase/beanPostProcessorCase.xml");
        MyJavaBean bean = (MyJavaBean) context.getBean("myJavaBean");
        System.out.println("===============下面输出结果============");
        System.out.println("描述：" + bean.getDesc());
        System.out.println("备注：" + bean.getRemark());
        
        System.out.println("关闭容器，清楚掉myJavaBean,触发回收");
        ((ClassPathXmlApplicationContext) context).close();
        
	}
}
