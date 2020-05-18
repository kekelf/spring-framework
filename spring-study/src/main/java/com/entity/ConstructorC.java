package com.entity;

public class ConstructorC {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		System.out.println("通过setter方式注入实体的属性");
		this.sex = sex;
	}
	
	
	
}
