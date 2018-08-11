package com.dy.work.test2;

import java.lang.reflect.GenericArrayType;

public class Player {

	private static int sum = 0;
	private Player() {
		
	}
	
	public Player getPlayer() {
		
		if (sum == 11) {
			System.out.println("对不起，已经创建了11个对象，不能再创建对象了");
			return null;
		} else {
			sum++;
			System.out.println("创建了一个对象");
		}

		return new Player();
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
