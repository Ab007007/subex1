package com.subex.javatraining.threads;

public class ThreadManager {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		OddNumbers od = new OddNumbers();
		EvenNumbers ev = new EvenNumbers();
		od.setName("OddNumberThread");
		ev.setName("EvenNumberThread");
		od.start();
		System.out.println(od.getName());
		ev.start();
		
		System.out.println(ev.getName());
		for (int i = 0; i < 100; i++) {
			System.out.println("main - " + i);
		}
	}
}
