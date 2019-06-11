package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("BankDAO")
public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QUERY="UPDATE BANK_ACCOUNT SET BALENCE=BALENCE-? WHERE ACC_NO=?";
	private static final String DEPOSIT_QUERY="UPDATE BANK_ACCOUNT SET BALENCE=BALENCE+? WHERE ACC_NO=?";
	
	@Autowired
	private JdbcTemplate jt;
	public int withdraw(int accno, float amt) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY, amt,accno);
		return count;
	}


	public int deposit(int accno, float amt) {
		int count=0;
		count=jt.update(DEPOSIT_QUERY,  amt,accno);
		return count;
	}

	
}
