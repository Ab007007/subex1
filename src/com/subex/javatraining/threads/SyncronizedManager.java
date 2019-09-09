package com.subex.javatraining.threads;

public class SyncronizedManager
{
	public static void main(String[] args) {
		
		SyncronizedDemo sd = new SyncronizedDemo();
		
		Thread t1 = new Thread(sd);
		t1.setPriority(1);
		Thread t2 = new Thread(sd);
		t2.setPriority(5);
		Thread t3 = new Thread(sd);
		t3.setPriority(10);
		Thread t4 = new Thread(sd);
		t4.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	System.out.println("Main Ended..************************************");
	}
	

}
