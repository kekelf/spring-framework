package com.entity;

public class MySingle {
	
	public MySingle() {
		System.out.println("class MySingle construct begin");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void beforeInitBeanMethod() {
		System.out.println("再实例化bean之前调用");
	}
	
	public void afterDestoryBeanMethod() {
		System.out.println("对于销毁方法的扩展");
	}
}
