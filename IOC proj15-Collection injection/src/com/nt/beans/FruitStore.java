package com.nt.beans;

import java.util.Properties;

public class FruitStore {
	private Properties fruits;

	public void setFruits(Properties fruits) {
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "FruitStore [fruits=" + fruits + "]";
	}

}
