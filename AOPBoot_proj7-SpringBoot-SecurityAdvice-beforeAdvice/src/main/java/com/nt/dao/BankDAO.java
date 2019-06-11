package com.nt.dao;

public interface BankDAO {
	public int withdraw(int accno,float amt);
	public int deposit(int accno,float amt);

}
