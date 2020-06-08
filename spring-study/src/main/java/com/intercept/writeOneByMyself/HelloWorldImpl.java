package com.intercept.writeOneByMyself;

public class HelloWorldImpl implements HelloWorld {
    public void sayHelloWorld() {
        System.out.println("Hello World");
    }

	@Override
	public void testHello() {
		System.out.println("test Hello Method");
	}
}