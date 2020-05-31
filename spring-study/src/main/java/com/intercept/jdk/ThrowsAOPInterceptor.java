package com.intercept.jdk;

import org.springframework.aop.ThrowsAdvice;

import javax.security.auth.login.AccountException;
import java.lang.reflect.Method;

public class ThrowsAOPInterceptor implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object instance, AccountException ex) throws Throwable{
        System.out.println("after()"+method.getName()+"throws exception:"+ex);
    }
    public void afterThrowing(NullPointerException ex) throws Throwable{
        System.out.println("throws exception:"+ex);
    }
}