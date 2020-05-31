package com.intercept.writeOneByMyself;
import java.lang.reflect.Method;
public class InterceptorImpl implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法前逻辑");
        return false;    //这里为false，则不调用目标原有方法，直接调用around的替代方法
    }
 
    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法后逻辑");
    }
 
    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("取代了被代理对象的方法");
    }
}