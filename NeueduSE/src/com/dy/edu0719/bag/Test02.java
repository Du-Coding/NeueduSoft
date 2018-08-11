package com.dy.edu0719.bag;

public class Test02 {

	int a;
	
	//如果a = 10相等，则是同一对象相等
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(a == 10) {
			return true;
		} else {
			return false;
		}
	}

	
	
}
