package com.entity;

public class ConstructorA {
	public ConstructorB cb;
	public ConstructorA(ConstructorB cb) {
		System.out.println("通过构造函数注入ContructorB cb属性给ConstructorA");
		this.cb = cb;
	}
	
}
