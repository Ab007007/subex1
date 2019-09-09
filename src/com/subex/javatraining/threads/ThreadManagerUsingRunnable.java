package com.subex.javatraining.threads;

public class ThreadManagerUsingRunnable {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		OddNumbersUsingRunnable od = new OddNumbersUsingRunnable();
		EvenNumbersUsingRunnable ev = new EvenNumbersUsingRunnable();
		Thread t1 = new Thread(od);
		Thread t2 =  new Thread(ev);
		
		t1.start();
		t2.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main - " + i);
		}
	}
}
