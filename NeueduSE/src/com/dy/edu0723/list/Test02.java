package com.dy.edu0723.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Test02 {

	public static void main(String[] args) {
		
		//LinkedList：双向链表
		//arrayList：单向链表，数组结构，初始值为10，扩容按1.5倍增长
		//栈（stack）：先进后出
		//队列（queue）：先进先出
		//环形队列：先写先被覆盖
		LinkedList list = new LinkedList<>();
		//add()方法，模拟队列
		/*list.add("我系渣渣辉");
		list.add("我系古天乐");
		list.add("系兄弟就来砍我");
		list.add("贪玩蓝月");
		list.add("你不知道的全新体验");*/
		
		//栈：push：入栈  pop：出栈
		//用栈实现队列的功能：用两个栈实现先进先出的队列功能
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
