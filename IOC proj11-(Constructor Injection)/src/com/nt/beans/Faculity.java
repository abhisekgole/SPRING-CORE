package com.nt.beans;

public class Faculity {

	private int empid;
	private String empName;
	private String add;
	private double sal;
	public Faculity(int empid, String empName, String add, double sal) {
		this.empid = empid;
		this.empName = empName;
		this.add = add;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Faculity [empid=" + empid + ", empName=" + empName + ", add=" + add + ", sal=" + sal + "]";
	}
	
}
