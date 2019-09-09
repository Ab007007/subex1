package com.subex.javatraining.abstractdemo;

public class Dummy {

	public static void main(String[] args) {
		System.out.println("main start");
		test();
		System.out.println("main ended");
	}
	static void test()
	{
		int a[] = new int[9];
		for (int i = 0; i < 10; i++) 
		{
			a[i] = i;
			System.out.println("Test " + a[i]);
		}
	}
}
