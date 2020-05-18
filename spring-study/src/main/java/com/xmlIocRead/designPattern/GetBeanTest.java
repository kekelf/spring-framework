package com.xmlIocRead.designPattern;

public abstract class GetBeanTest {
	public void showMe() {
		this.getBeanMethod().showMe();
	};
	
	public abstract User getBeanMethod();
}
