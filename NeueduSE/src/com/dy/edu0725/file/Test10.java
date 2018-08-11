package com.dy.edu0725.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test10 {

	public static void main(String[] args) throws Exception{
		//如果Object类中某个属性不想被序列化，以下两种方式：
		//1、static修饰符：在静态方法区中
		//2、transient修饰符：
		//序列化流（对象序列化，字节流，高级流）：ObjectInputStream，ObjectOutputStream
		//实现序列化接口，指定类implements Serializable接口----->SerializableUID
		Person ly = new Person();
		ly.setName("流域");
		ly.setAge(28);
		
		//序列化流：序列化/反序列化
		//序列化（ObjectOutputStream）：内存--->外存，父类：java.io.OutputStream ---->java.io.ObjectOutputStream
		//反序列化（ObjectInputStream）：外存--->内存,父类：java.io.InputStream ---->java.io.ObjectInputStream
		//比如在学校介绍淘宝双十一的高并发。将购物车的数据放入外存中，防止服务器崩溃
		
		FileOutputStream fos = new FileOutputStream("E:\\iotest\\aaa.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(ly);
		
		oos.close();
		fos.close();
		
		
	}
	
}
