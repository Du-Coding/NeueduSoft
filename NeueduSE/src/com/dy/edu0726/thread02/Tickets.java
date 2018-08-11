package com.dy.edu0726.thread02;

public class Tickets implements Runnable{

	int tickets = 100;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
//			buyTicket();
			//this--->对象锁
			//需确定同一把锁，
			//类名.class--->类锁（特殊的对象锁）
			synchronized(this) {
				if(tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("当前票数剩余" + tickets);
					System.out.println(Thread.currentThread().getName() + "卖出了1张票，剩余" + --tickets);
				}
				if(tickets == 0) {
					break;
				}
			}
		}
	}

	/*public synchronized void buyTicket() {
		if(tickets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("当前票数剩余" + tickets);
			System.out.println(Thread.currentThread().getName() + "卖出了1张票，剩余" + --tickets);
		}
	}*/
	
}
