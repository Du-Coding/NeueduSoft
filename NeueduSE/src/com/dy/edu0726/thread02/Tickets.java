package com.dy.edu0726.thread02;

public class Tickets implements Runnable{

	int tickets = 100;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
//			buyTicket();
			//this--->������
			//��ȷ��ͬһ������
			//����.class--->����������Ķ�������
			synchronized(this) {
				if(tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("��ǰƱ��ʣ��" + tickets);
					System.out.println(Thread.currentThread().getName() + "������1��Ʊ��ʣ��" + --tickets);
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
			System.out.println("��ǰƱ��ʣ��" + tickets);
			System.out.println(Thread.currentThread().getName() + "������1��Ʊ��ʣ��" + --tickets);
		}
	}*/
	
}
