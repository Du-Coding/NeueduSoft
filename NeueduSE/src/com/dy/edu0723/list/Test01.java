package com.dy.edu0723.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test01 {

	public static void main(String[] args) {
		
		//<E>������
		//list����ȡ˳��һ��----->���򣬿��ظ�
		//add()��������Ԫ��  remove()��ɾ��ָ����Ԫ��  set()���޸�ָ��Ԫ��
		//indexOf()����ѯ��һ�γ���ָ��Ԫ�ص�����
		List<String> list = new ArrayList<>();
		list.add("����������");
		list.add("���ǹ�����");
		list.add("���ֵܾ�������");
//		list.remove(0);
//		list.set(0, "̰������");
		System.out.println(list);//�鿴list���ڴ�ṹ
		
		
		//��α������鼯��
		//List���Ͻ�����ת��Ϊ���飬�ڶ�������б���
//		Object[] o = list.toArray();
//		for(Object a : o) {
//			System.out.println(a);
//		}
		//ʹ�õ������������������ã�
		//�ڵ������н��е���ʱ������ͨ��list�еķ�������������Ԫ��
		//ʹ�õ������еķ�������������Ԫ��
		//Iteratorû��add()����������list����ʱ��Ҫʹ��add()������Ҫʹ��ListIterator��
		//ListIterator��Iterator������
		ListIterator<String> i = list.listIterator();
		while(i.hasNext()) {
			String a = i.next();
			if (a == "���ǹ�����") {
//				i.remove();
				i.add("�ܽ���");
			}
			System.out.println(a);
		}
		System.out.println(list);
//		for (String a : list) {
//			System.out.println(a);
//		}
		
		//������Ҫͳһ����������
//		Integer[] a = new Integer[10];
//		String[] b = new String[10];
//		a[0] = 1;
//		System.out.println(a[0]);
//		b[0] = "aaa";
//		System.out.println(b[0]);
//		//int ---> String
//		b[0] = 1 + "";
//		
//		Object[] c = new Object[10];
//		c[0] = 111;
//		c[1] = "SDAAD";
//		System.out.println(c[0]);
//		System.out.println(c[1]);
		
	}
	
}
