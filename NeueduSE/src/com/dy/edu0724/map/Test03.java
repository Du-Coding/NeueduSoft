package com.dy.edu0724.map;

import java.util.TreeMap;

public class Test03 {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap<>();
		tm.put(111, "111111");
		tm.put(222, "111111");
		tm.put(333, "111111");
		tm.put(444, "111111");
		tm.put(555, "111111");
		tm.put(666, "111111");
		tm.put(777, "111111");
		tm.put(888, "111111");
		tm.put(null, "111111");
		System.out.println(tm.get(null));
		
	}
	
}
