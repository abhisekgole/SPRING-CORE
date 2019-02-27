package com.nt.beans;

import java.util.List;

public class College {
	private List<String>studName;
      	public College(List<String> studName) {
	
		this.studName = studName;
	}
		@Override
		public String toString() {
			return "College [studName=" + studName + "]";
		}

		

		
		
}
