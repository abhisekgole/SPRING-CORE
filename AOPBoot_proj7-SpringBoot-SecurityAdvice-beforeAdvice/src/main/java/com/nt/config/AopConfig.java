package com.nt.config;

import javax.sql.DataSource;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.service.BankService;

@Configuration
@ComponentScan(basePackages= {"com.nt.manager","com.nt.advice"})
public class AopConfig {
	@Autowired
	private BankService bankService;
	
	@Bean("pfb")
	public ProxyFactoryBean createFBean() {
		ProxyFactoryBean proxy=null;
		proxy= new ProxyFactoryBean();
		proxy.setTarget(bankService);
		proxy.setInterceptorNames("securityCheck");
		return proxy;
		
	}

}
