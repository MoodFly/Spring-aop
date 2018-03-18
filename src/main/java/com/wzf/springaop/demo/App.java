package com.wzf.springaop.demo;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wzf.springaop.demo.face.Parent;
import com.wzf.springaop.demo.face.SendMessage;
import com.wzf.springaop.demo.face.impl.ParentImpl;
import com.wzf.springaop.demo.face.proxy.ParentBAAdviceProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello! TestDemo" );
      /* 
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(new ParentImpl());
        proxyFactory.addAdvice(new ParentBAAdviceProxy());
        Parent parent=(Parent) proxyFactory.getProxy();
        parent.doWork();
       */
/*        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring.xml");
        ParentImpl parent=(ParentImpl) ac.getBean("proxy");
        parent.doWork();
        SendMessage message=(SendMessage) parent;
        message.sendSMS("150xxxx7764", "work is success");
        message.sendEmail("150xxxx4476@163.com", "<html>.....success</html");*/
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring.xml");
        Parent parent=(Parent) ac.getBean("parent");
        parent.doWork();
       /* parent.gotoShopping();
        parent.gotoWatchMovie();*/
        SendMessage message=(SendMessage) parent;
        message.sendSMS("150xxxx7764", "work is success");
        message.sendEmail("150xxxx4476@163.com", "<html>.....success</html");
    }
}
