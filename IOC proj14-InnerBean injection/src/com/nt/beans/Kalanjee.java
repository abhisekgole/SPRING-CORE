package com.nt.beans;

public class Kalanjee {
	private String type;
	private String price;
	
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Kalanjee [type=" + type + ", price=" + price + "]";
	}
    
	
}
