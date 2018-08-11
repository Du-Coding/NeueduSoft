package com.dy.edu0723.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
		
		//输出顺序与输入顺序不同：无序，不可重复
		//参数不能为空
		//红黑树 ---> 平衡二叉树
		TreeSet t = new TreeSet<>();
		t.add(12);
		t.add(15);
		t.add(5);
		t.add(9);
		t.add(3);
		t.add(2);
		Iterator i = t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
