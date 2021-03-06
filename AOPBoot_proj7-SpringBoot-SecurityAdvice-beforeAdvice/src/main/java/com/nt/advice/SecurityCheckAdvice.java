package com.nt.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.manager.AuthenticationManager;

@Component("securityCheck")
public class SecurityCheckAdvice implements MethodBeforeAdvice {
	 @Autowired
	private AuthenticationManager manager;
	public void before(Method method, Object[] args, Object target) throws Throwable {
		if(manager.authenaticate()) throw new IllegalArgumentException("Invalid Cretantial");
			
		
	}

}
