package com.aop.son;

public class Son extends Father{
	
	public void show() {
		System.out.println("before");
		super.show();
		System.out.println("after");
	}
}
