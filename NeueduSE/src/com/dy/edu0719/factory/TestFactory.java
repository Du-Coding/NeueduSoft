package com.dy.edu0719.factory;

import com.dy.edu0719.BMW;
import com.dy.edu0719.BMW02;

public class TestFactory {

	public static void main(String[] args) {
		
		//�򵥹�����һ�����������߼��жϲ��������Ʒ
		//����ģʽ����ͬ�Ĺ���������ͬ�Ĳ�Ʒ����֤һ������ֻ����һ����Ʒ
		FactoryBMW320 factoryBMW320 = new FactoryBMW320(); 
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		BMW bmw523 = (BMW) factoryBMW523.makeCar();
		BMW02 bmw320 = (BMW02) factoryBMW320.makeCar();
				
	}
	
}
