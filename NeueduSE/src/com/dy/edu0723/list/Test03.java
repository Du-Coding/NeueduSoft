package com.dy.edu0723.list;

import java.util.LinkedList;
import java.util.List;

public class Test03 {
	
	LinkedList list_1 = new LinkedList<>();
	LinkedList list_2 = new LinkedList<>();
	
	public void stackInput(Object o) {
		list_1.push(o);//��list_1�м���Ԫ��
	}
	
	public Object stackOut() {

		while(!steackEmpty(list_1)) {//�ж�list_1
			list_2.push(list_1.pop());
		}
		if(!steackEmpty(list_2)) {
			return list_2.pop();
		}else {
			return "�Բ���";
		}
		
	}
	
	//�ж�list�Ƿ�Ϊ�գ����Ϊ�շ���true�����򷵻�false
	public boolean steackEmpty(List list) {
		if(list.size() <= 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		Test03 t = new Test03();
		t.stackInput("aaa");
		t.stackInput("bbb");
		System.out.println(t.stackOut());
		System.out.println(t.stackOut());
		
	}
	
}
