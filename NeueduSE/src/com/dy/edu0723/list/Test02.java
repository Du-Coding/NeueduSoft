package com.dy.edu0723.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Test02 {

	public static void main(String[] args) {
		
		//LinkedList��˫������
		//arrayList��������������ṹ����ʼֵΪ10�����ݰ�1.5������
		//ջ��stack�����Ƚ����
		//���У�queue�����Ƚ��ȳ�
		//���ζ��У���д�ȱ�����
		LinkedList list = new LinkedList<>();
		//add()������ģ�����
		/*list.add("��ϵ������");
		list.add("��ϵ������");
		list.add("ϵ�ֵܾ�������");
		list.add("̰������");
		list.add("�㲻֪����ȫ������");*/
		
		//ջ��push����ջ  pop����ջ
		//��ջʵ�ֶ��еĹ��ܣ�������ջʵ���Ƚ��ȳ��Ķ��й���
		list.push("aaa");
		list.push("bbb");
		list.pop();
		list.push("ccc");
		list.push("ddd");
		list.push("eee");
		list.pop();
//		System.out.println(list.getLast());
		
		System.out.println(list.pop());
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			String a = (String) i.next();
			System.out.println(a);
		}
		
	}
	
}
