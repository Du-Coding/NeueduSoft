package com.dy.edu0719.factory;

import com.dy.edu0719.BMW;
import com.dy.edu0719.BMW02;

public class TestFactory {

	public static void main(String[] args) {
		
		//简单工厂：一个工厂根据逻辑判断产生多个产品
		//工厂模式：不同的工厂产生不同的产品，保证一个工厂只产生一个产品
		FactoryBMW320 factoryBMW320 = new FactoryBMW320(); 
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		BMW bmw523 = (BMW) factoryBMW523.makeCar();
		BMW02 bmw320 = (BMW02) factoryBMW320.makeCar();
				
	}
	
}
