package com.intercept.jdk.aop;

import org.springframework.aop.MethodBeforeAdvice;

import com.aop.jdk.Calculator;
import com.aop.jdk.CalculatorProxy;
import com.aop.jdk.MyCalculator;

import java.lang.reflect.Method;

public class BeforeAOPInterceptor implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object instance)
            throws Throwable {
        System.out.println("before()"+method.getName());
        
//        Object proxy = CalculatorProxy.getProxy(new MyCalculator());
//        System.out.println(((Calculator)proxy).add(1, 1));
    }
}