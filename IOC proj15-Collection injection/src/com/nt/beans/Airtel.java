package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class Airtel {
//set collection don't allows duplicate values
	private Set<Long> mobno;
	private Set<Date> date;
	public void setMobno(Set<Long> mobno) {
		this.mobno = mobno;
	}
	public void setDate(Set<Date> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Airtel [mobno=" + mobno + ", date=" + date + "]";
	}
	
	
}
