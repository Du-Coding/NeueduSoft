package com.dy.edu0723.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
		
		//���˳��������˳��ͬ�����򣬲����ظ�
		//��������Ϊ��
		//����� ---> ƽ�������
		TreeSet t = new TreeSet<>();
		t.add(12);
		t.add(15);
		t.add(5);
		t.add(9);
		t.add(3);
		t.add(2);
		Iterator i = t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
