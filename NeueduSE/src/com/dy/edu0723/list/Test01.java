package com.dy.edu0723.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test01 {

	public static void main(String[] args) {
		
		//<E>：泛型
		//list：存取顺序一致----->有序，可重复
		//add()：增加新元素  remove()：删除指定的元素  set()：修改指定元素
		//indexOf()：查询第一次出现指定元素的索引
		List<String> list = new ArrayList<>();
		list.add("我是渣渣辉");
		list.add("我是古天乐");
		list.add("是兄弟就来砍我");
//		list.remove(0);
//		list.set(0, "贪玩蓝月");
		System.out.println(list);//查看list的内存结构
		
		
		//如何遍历数组集合
		//List集合将集合转换为数组，在对数组进行遍历
//		Object[] o = list.toArray();
//		for(Object a : o) {
//			System.out.println(a);
//		}
		//使用迭代器（遍历器，常用）
		//在迭代其中进行迭代时，不能通过list中的方法来操作数据元素
		//使用迭代器中的方法来操作数据元素
		//Iterator没有add()方法，操作list集合时想要使用add()方法需要使用ListIterator。
		//ListIterator与Iterator的区别
		ListIterator<String> i = list.listIterator();
		while(i.hasNext()) {
			String a = i.next();
			if (a == "我是古天乐") {
//				i.remove();
				i.add("周杰伦");
			}
			System.out.println(a);
		}
		System.out.println(list);
//		for (String a : list) {
//			System.out.println(a);
//		}
		
		//数组需要统一的数据类型
//		Integer[] a = new Integer[10];
//		String[] b = new String[10];
//		a[0] = 1;
//		System.out.println(a[0]);
//		b[0] = "aaa";
//		System.out.println(b[0]);
//		//int ---> String
//		b[0] = 1 + "";
//		
//		Object[] c = new Object[10];
//		c[0] = 111;
//		c[1] = "SDAAD";
//		System.out.println(c[0]);
//		System.out.println(c[1]);
		
	}
	
}
