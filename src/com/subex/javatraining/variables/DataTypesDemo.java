package com.subex.javatraining.variables;

public class DataTypesDemo {
	static int b;

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		System.out.println(DataTypesDemo.b);
		test();
	}

	/*
	 * [access specifiers] [access modifier] return_type methodName([arg1,arg2,..])
	 * {
	 * 
	 * 
	 * }
	 */
	static void test() {
		int a = 20;
		int c=30;
		System.out.println(a);
		System.out.println(DataTypesDemo.b);
		System.out.println(c);
	}

}
