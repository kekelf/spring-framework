package com.xmlIocRead.circleReference;

public class TestA {
	private TestB testB;

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
	
}
