package com.xmlIocRead.circleReference;

public class TestB {
	private String sex;
	private TestC testC;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public TestC getTestC() {
		return testC;
	}
	public void setTestC(TestC testC) {
		this.testC = testC;
	}
	
	
}
