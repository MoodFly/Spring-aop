package com.wzf.springaop.demo.face.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

/**
 * @author wzf
 * 日志切面,方法执行前通知和方法执行后通知
 */
@Component
public class ParentBAAdviceProxy implements MethodBeforeAdvice,AfterReturningAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Method 开始工作，");
	}
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("Method 工作了完毕了，");
	}

}
