package com.nt.beans;
import java.util.Map;

public class Faculty {
	private Map<String,String>faculty;

	private Map<String,Long>phoneNo;

	public void setFaculty(Map<String, String> faculty) {
		this.faculty = faculty;
	}

	public void setPhoneNo(Map<String, Long> phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Faculty [faculty=" + faculty + ", phoneNo=" + phoneNo + "]";
	}



		
		
}
