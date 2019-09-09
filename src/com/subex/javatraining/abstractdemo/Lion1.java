package com.subex.javatraining.abstractdemo;

public class Lion1 implements Animal {
	@Override
	public void family() {
		// TODO Auto-generated method stub
		System.out.println("Implemented method");
	}
	
	public static void main(String[] args) {
		Lion1 ll = new Lion1();
		Lion1 l2 = new Lion1();
		ll.family();
		l2.family();
	}
}
