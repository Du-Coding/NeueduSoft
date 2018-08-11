package com.dy.edu0724.map;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		
		//Map<key, value>：通过key值找value值
		//一个key值对应一个value值（key值不能重复，如重复，取最后的值）
		//一个value值对应多个key值
		Map<String, String> m = new HashMap<>();
		m.put("朱", "赤1");
		m.put("朱", "赤2");
		m.put("墨", "黑");
		System.out.println(m.get("朱"));
		
	}
	
}
