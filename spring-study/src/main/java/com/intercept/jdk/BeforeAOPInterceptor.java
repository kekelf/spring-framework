package com.intercept.jdk;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAOPInterceptor implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object instance)
            throws Throwable {
        System.out.println("before()"+method.getName());
    }
}