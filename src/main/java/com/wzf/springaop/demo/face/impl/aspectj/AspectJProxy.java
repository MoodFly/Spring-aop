package com.wzf.springaop.demo.face.impl.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.wzf.springaop.demo.face.SendMessage;
import com.wzf.springaop.demo.face.impl.SendMessageProxy;

@Aspect
@Component
public class AspectJProxy {
	@DeclareParents(value="com.wzf.springaop.demo.face.impl.ParentImpl",defaultImpl=SendMessageProxy.class)
	private SendMessage sendMessage;
	@Around("execution(* com.wzf.springaop.demo.face.impl.ParentImpl.goto*(..))")
	public Object around(ProceedingJoinPoint pjp){
		Before();
		Object obj=null;
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		After();
		return obj;
	}
	public void Before(){
		System.out.println("before");
	}
	public void After(){
		System.out.println("after");
		
	}
	
}
