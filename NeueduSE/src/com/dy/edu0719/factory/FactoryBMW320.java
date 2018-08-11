package com.dy.edu0719.factory;

import com.dy.edu0719.BMW02;
import com.dy.edu0719.Bmw00;

public class FactoryBMW320 implements FactoryBMW{

	@Override
	public Bmw00 makeCar() {
		// TODO Auto-generated method stub
		return new BMW02();
	}

}
