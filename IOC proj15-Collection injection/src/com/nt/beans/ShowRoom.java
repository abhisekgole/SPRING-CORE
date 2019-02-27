package com.nt.beans;

import java.util.Arrays;

public class ShowRoom {
		private String[]brands;
		private String[]priceRange;
		public void setBrands(String[] brands) {
			this.brands = brands;
		}
		public void setPriceRange(String[] priceRange) {
			this.priceRange = priceRange;
		}
		@Override
		public String toString() {
			return "ShowRoom [brands=" + Arrays.toString(brands) + ", priceRange=" + Arrays.toString(priceRange) + "]";
		}
		
}
