package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BankDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDAO dao;

	public String withdrawMoney(int accno, float amt) {
		int count=0;
		
	      //use dao
		count=dao.withdraw(accno, amt);
		if(count==0)
			return "money is not withdraw";
		else
         return "money is withdraw";
	}


	public String depositMoney(int accno, float amt) {
		int count=0;
		
	      //use dao
		count=dao.deposit(accno, amt);
		if(count==0)
			return "money is not deposit";
		else
       return "money is deposit";
	}
	
	

}
