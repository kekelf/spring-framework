package com.intercept.jdk.aop;

public class MyCalculator implements Calculator{
	private String name;
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;

    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void withoutAop() {
		System.out.println("jdk aop withoutAop function");
	}
}
