package com.dy.edu0719;

public class BMWTest {

//	//普通实例化对象
//	BMW bmw = new BMW();
//	BMW02 bmw02 = new BMW02();
	
	//提车
	public static void main(String[] args) {
		
		BMWFactory bmwFactory = new BMWFactory();
		
		//多态：父类引用指向子类
		//
		BMW b1 = (BMW) bmwFactory.makeCar("BMW");
		BMW02 b2 = (BMW02) bmwFactory.makeCar("BMW02");
		
	}
	
}
