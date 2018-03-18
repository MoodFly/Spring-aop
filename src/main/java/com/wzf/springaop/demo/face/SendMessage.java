package com.wzf.springaop.demo.face;

/**
 * @author wzf
 * 用户通知接口
 * 用于发送邮件和短信
 */
public interface SendMessage {
	void sendSMS(String userAuth,String message);
	void sendEmail(String userAuth,String emailHtml);
}
