package com.intercept.writeOneByMyself;

/**
 * 设计模式：拦截器
 * 参考：https://blog.csdn.net/c_little_white/article/details/86571636
 */
public class TestMain {
    public static void main(String args[]) {
        HelloWorld proxy = (HelloWorld) JdkProxyExample.bind(new HelloWorldImpl(), "com.intercept.writeOneByMyself.InterceptorImpl");
        proxy.sayHelloWorld();
    }
}