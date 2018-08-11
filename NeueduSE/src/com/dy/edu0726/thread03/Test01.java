package com.dy.edu0726.thread03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {

	public static void main(String[] args) {
		
		//线程池--->一个或多个线程
		//新建线程池
		ExecutorService es = Executors.newFixedThreadPool(2);
		//提交
		/*es.submit(new RunnableTest());
		es.submit(new RunnableTest());
		es.submit(new RunnableTest());
		es.submit(new RunnableTest());
		es.submit(new RunnableTest());*/
		//关闭线程
//		es.shutdown();
		
		Future f_1 = es.submit(new CallableTest());
		try {
			String a = (String) f_1.get();
			System.out.println(a);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
