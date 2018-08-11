package com.dy.edu0723.list;

import java.util.LinkedList;
import java.util.List;

public class Test03 {
	
	LinkedList list_1 = new LinkedList<>();
	LinkedList list_2 = new LinkedList<>();
	
	public void stackInput(Object o) {
		list_1.push(o);//向list_1中加入元素
	}
	
	public Object stackOut() {

		while(!steackEmpty(list_1)) {//判断list_1
			list_2.push(list_1.pop());
		}
		if(!steackEmpty(list_2)) {
			return list_2.pop();
		}else {
			return "对不起";
		}
		
	}
	
	//判断list是否为空，如果为空返回true，否则返回false
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
