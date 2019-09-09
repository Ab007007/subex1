package com.subex.javatraining.accessspecifiers.pack1;

public class Z {
	
	public static void main(String[] args) {
		A a1 = new A();
//		System.out.println(a1.privateVariable);
		System.out.println(a1.defaultVariable);
		System.out.println(a1.protectedVariable);
		System.out.println(a1.publicVariable);
	}

}
