package com.dy.edu0719.factory;

import com.dy.edu0719.BMW;
import com.dy.edu0719.Bmw00;

public class FactoryBMW523 implements FactoryBMW {

	@Override
	public Bmw00 makeCar() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
