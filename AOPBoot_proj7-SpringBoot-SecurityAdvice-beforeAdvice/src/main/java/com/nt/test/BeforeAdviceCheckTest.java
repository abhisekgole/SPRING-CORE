package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.manager.AuthenticationManager;
import com.nt.service.BankService;

@SpringBootApplication
@Import(AppConfig.class)
public class BeforeAdviceCheckTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager manager=null;
		BankService proxy=null;
		//create IOC container
		ctx= SpringApplication.run(BeforeAdviceCheckTest.class,args);
		//create bean class
		manager=ctx.getBean("authManager",AuthenticationManager.class);
		//perform singIn operation
		manager.signIn("abhisek", "ameerpet");
		//get proxy class object
		proxy=ctx.getBean("pfb",BankService.class);
		
		//invoked the method
		System.out.println(proxy.depositMoney(1004, 10001));
		System.out.println("===================================");
		System.out.println(proxy.withdrawMoney(1004,3333));
		
		//perform singOut operation	
		manager.signOut();	
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();
		
	}

}
