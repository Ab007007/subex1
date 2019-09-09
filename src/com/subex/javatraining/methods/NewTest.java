package com.subex.javatraining.methods;

public class NewTest extends Test
{
	@Override
	public void test() {
		System.out.println("New Test Class function");
	}

	public void test1()
	{
		System.out.println("only in subclass");
	}
	public static void main(String[] args) {
		
		Test t1 = new Test();
		NewTest t2 = new NewTest();
		Test t3 = new NewTest();
	//	NewTest t4 = new Test();
		
		
		t1.test();
		t2.test();
		t3.test();
	//	t3.test1();
	}
	
}
