package com.dy.edu0723.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {

	public static void main(String[] args) {
		
		
		Collection c = new ArrayList<>();//���Ͽ����Զ�������
		//Object ---> ���࣬Ҳ�ǰ�װ�������͵ĳ���
		//������������--->�����Զ�װ�䣺int 10 ----> Integer
		//Object�ǰ�װ�������͵ĳ��࣬Integer 10---> Object���͵ĸ�������ָ������������ʽ
		//���� 10 ���Է��ڷ�������
		c.add(10);
		c.add(20);
		c.add(30);
		System.out.println(c.size());
		Object[] oarray = c.toArray();
		//����Object����
		for (Object a : oarray) {
			//��syytem.out.println()�������һ�����൱���Զ�����toString()����
			//��Ϊ���˸�������ָ�����������γɣ�Object a = new Integer(),
			//���� ����toString()����ʱ������д��ʵ�ʵ��õ���Integer���е�toString()����.���������10
			System.out.println(a);
			
		}
		
	}
	
}
