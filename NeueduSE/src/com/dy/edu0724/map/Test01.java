package com.dy.edu0724.map;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		
		//Map<key, value>��ͨ��keyֵ��valueֵ
		//һ��keyֵ��Ӧһ��valueֵ��keyֵ�����ظ������ظ���ȡ����ֵ��
		//һ��valueֵ��Ӧ���keyֵ
		Map<String, String> m = new HashMap<>();
		m.put("��", "��1");
		m.put("��", "��2");
		m.put("ī", "��");
		System.out.println(m.get("��"));
		
	}
	
}
