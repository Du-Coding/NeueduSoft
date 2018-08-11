package com.dy.edu0719.work;

public class CommodityTest {

	public static void main(String[] args) {
		
		Commodity c1 = new Commodity();
		c1.setName("Wahaha");
		c1.setPrice(25.0);
		Commodity c2 = new Commodity();
		c2.setName("Wahaha");
		c2.setPrice(25.0);
		
		System.out.println(c1.equals(c2));
		
	}
	
}
