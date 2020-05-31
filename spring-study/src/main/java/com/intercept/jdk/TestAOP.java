package com.intercept.jdk;

public class TestAOP implements IService {
    private String name;
    public void withAop() {
        System.out.println("with AOP name:"+name);
    }
    public void withoutAop() {
        System.out.println("TestAOP`s function without  name:"+name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}