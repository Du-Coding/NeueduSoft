package com.dy.edu0719;

public class BMWFactory {

	//´´½¨³µ
	public Bmw00 makeCar(String type) {
		
		Bmw00 b1 = null;
		if(type.equals("BMW")) {
			b1 = new BMW();
		} else if (type.equals("BMW02")) {
			b1 = new BMW02();
		}
		return b1;
		
	}
	
}
