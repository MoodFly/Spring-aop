package com.wzf.springaop.demo.face.impl;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

import com.wzf.springaop.demo.face.SendMessage;

/**
 * @author wzf
 * 增强ParentImpl 使其增加发送短信和邮件的功能。
 */
@Component
public class SendMessageProxy extends DelegatingIntroductionInterceptor implements SendMessage {

	public void sendSMS(String userAuth, String message) {
		System.out.println("开始发送短信。。。。。。");
		try {
			//模拟短信网关发送消息。
			Thread.sleep(2000);
			System.out.println("接收方手机号："+userAuth+" message:"+message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("短信发送成功。。。。。。");
	}
	public void sendEmail(String userAuth, String emailHtml) {
		System.out.println("开始发送邮件。。。。。。");
		try {
			//模拟邮件服务器发送邮件。
			Thread.sleep(2000);
			System.out.println("接收方邮箱："+userAuth+" emailHtml:"+emailHtml);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("邮件发送成功。。。。。。");
	}
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		return super.invoke(mi);
	}
}
