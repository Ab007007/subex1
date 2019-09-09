package com.subex.javatraining.accessspecifiers.pack1;

public class A {
	private int privateVariable = 10;
	int defaultVariable =20;
	protected int protectedVariable =30;
	public int publicVariable =40;
	
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.privateVariable);
		System.out.println(a1.defaultVariable);
		System.out.println(a1.protectedVariable);
		System.out.println(a1.publicVariable);
		
	}

}
