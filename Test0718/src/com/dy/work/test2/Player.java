package com.dy.work.test2;

import java.lang.reflect.GenericArrayType;

public class Player {

	private static int sum = 0;
	private Player() {
		
	}
	
	public Player getPlayer() {
		
		if (sum == 11) {
			System.out.println("�Բ����Ѿ�������11�����󣬲����ٴ���������");
			return null;
		} else {
			sum++;
			System.out.println("������һ������");
		}

		return new Player();
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
