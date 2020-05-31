package com.intercept.jdk;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAOPInterceptor implements AfterReturningAdvice {
    public void afterReturning(Object value, Method method, Object[] args,
                               Object instance) throws Throwable {
        System.out.println("after()"+method.getName());
    }
}