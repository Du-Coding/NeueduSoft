package com.dy.edu0719;

public class BMWTest {

//	//��ͨʵ��������
//	BMW bmw = new BMW();
//	BMW02 bmw02 = new BMW02();
	
	//�ᳵ
	public static void main(String[] args) {
		
		BMWFactory bmwFactory = new BMWFactory();
		
		//��̬����������ָ������
		//
		BMW b1 = (BMW) bmwFactory.makeCar("BMW");
		BMW02 b2 = (BMW02) bmwFactory.makeCar("BMW02");
		
	}
	
}
