package com.container.beanPostProcessorCase;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyJavaBean implements InitializingBean,DisposableBean{
	private String desc;
	private String remark;

	public MyJavaBean() {
		System.out.println("MyJavaBean的构造函数被执行啦");
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		System.out.println("调用setDesc方法");
		this.desc = desc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		System.out.println("调用setRemark方法");
		this.remark = remark;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("调用afterPropertiesSet方法");
		this.desc = "在初始化方法中修改之后的描述信息";
	}

	public void initMethod() {
		System.out.println("调用initMethod方法");
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[描述：").append(desc);
		builder.append("， 备注：").append(remark).append("]");
		return builder.toString();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("implements DisposableBean destory Method(在单例模式下才会调用)");
	}
	
	public void destoryMethod() {
		System.out.println("gc myJavaBean bean object(在单例模式下才会调用)");
	}
}