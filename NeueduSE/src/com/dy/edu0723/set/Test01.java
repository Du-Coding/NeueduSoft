package com.dy.edu0723.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>(); //�����Ҳ����ظ�������ʹ��nullֵ
		//���equals()�ж�ֵ��ȣ�hashcode�����
		//Ĭ�ϼ�������ֵ��0.75
		s.add("aaa");
		s.add("bbb");
		s.add("ccc");
		s.add("eee");
		s.add("bbb");
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			String s_1 = i.next();
			System.out.println(s_1);
		}
		
	}
	
}
