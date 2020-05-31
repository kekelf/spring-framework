package com.intercept.writeOneByMyself;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class JdkProxyExample implements InvocationHandler {
 
    private Object target = null;
    private String interceptorClass = null;
 
    public JdkProxyExample(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }
 
    ////这里利用反射生成代理类
    public static Object bind(Object target, String interceptorClass) {
    	 //获取类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //获取要实现的接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        
//        Proxy.newProxyInstance(loader, interfaces, h) h就是InvocationHandler，因为继承InvocationHandler，所以new JdkProxyExample等价于InvocationHandler
        return Proxy.newProxyInstance(classLoader, interfaces, new JdkProxyExample(target, interceptorClass));
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(interceptorClass == null) {
            return method.invoke(target, args);
        }
        Object returnObj = null;
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
        ////这里便是拦截器的核心了
        if(interceptor.before(proxy, target, method, args)) {
            returnObj = method.invoke(target, args);
        }else {
            interceptor.around(proxy, target, method, args);
        }
        interceptor.after(proxy, target, method, args);
        return returnObj;
    }
}