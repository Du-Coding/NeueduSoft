package com.dy.edu0724.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hash = new HashMap<>();
		hash.put(111, "111111");
		hash.put(222, "111112");
		hash.put(333, "111113");
		hash.put(444, "111114");
		hash.put(555, "111115");
		hash.put(666, "111116");
		hash.put(777, "111117");
		hash.put(888, "111118");
		hash.put(999, "111119");
//		System.out.println(hash.get(null));
		
		//Map���ϱ���
		//������ֻ��д������������
		//1����keyֵװ��set���ϵ��У�������set�����е�iterator���б���
		Set<Integer> s = hash.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			int key = (int) i.next();
			System.out.println(hash.get(key));
		}
		
		//2����key�� value����һ������Map.entry
		Set<Entry<Integer, String>> sm = hash.entrySet();
		Iterator<Entry<Integer, String>> i_2 = sm.iterator();
		while(i_2.hasNext()) {
			Map.Entry<Integer, String> me = (Entry<Integer, String>) i_2.next();
			System.out.println(me.getKey() + " " + me.getValue());
		}
		
		//3��ֻ��valueֵ��
		Collection c = hash.values();
		Iterator i_3 = c.iterator();
		while(i_3.hasNext()) {
			System.out.println(i_3.next());
		}
		
		
	}
	
}
