package com.wzf.springaop.demo.face.proxy;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author wzf
 * 环绕通知。可以理解为Before和After的组合。。
 */
@Component
public class ParentRoundAdviceProxy implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		before();
		Object object=invocation.proceed();
		after();
		return object;
	}
	public void before() throws Throwable {
		System.out.println("Method 开始工作，");
	}
	public void after() throws Throwable {
		System.out.println("Method 工作完毕，");
	}

}
