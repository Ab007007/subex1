package com.subex.javatraining.threads;

public class SyncronizedDemo implements Runnable
{
	public synchronized void test()
	{
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " test - " + i);
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		test();
		
	}

}
