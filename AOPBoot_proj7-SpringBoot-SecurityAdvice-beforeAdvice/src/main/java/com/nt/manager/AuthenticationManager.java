package com.nt.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.UserDetailsBO;
import com.nt.dao.AuthenticationDAO;
import com.nt.dto.UserDetailsDTO;

@Component("authManager")
public class AuthenticationManager {
	@Autowired
	private  AuthenticationDAO authdao;

	private ThreadLocal<UserDetailsDTO>threadLocal=new ThreadLocal();
	
	public void signIn(String username,String password) {
		 
		UserDetailsDTO dto=null;
		dto= new UserDetailsDTO();
		dto.setUsername(username);
		dto.setPassword(password);
		threadLocal.set(dto);
	}
	public boolean authenaticate() {
		UserDetailsBO bo=null;
		UserDetailsDTO dto=null;
		int count=0;
		
		dto=threadLocal.get();
		bo=new UserDetailsBO();
		BeanUtils.copyProperties(dto, bo);
		count=authdao.validate(bo);
		
		return count==0;
		
	}
	public void signOut() {
		threadLocal.remove();
	}



}
