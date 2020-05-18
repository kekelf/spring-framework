package com.entity;

public class ConstructorB {
	public String age;

	public ConstructorB(String age) {
		System.out.println("通过构造器注入age属性");
		this.age = age;
	}
}
