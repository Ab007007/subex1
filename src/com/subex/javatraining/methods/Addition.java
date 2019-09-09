package com.subex.javatraining.methods;

public class Addition {
	
	static final double PI = 3.142;
	int dummy = 0;
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.sum(2,3);
		areaOfCircle(2);
		
		
	}
	
	
	public static void areaOfCircle(double radius)
	{
		System.out.println("Area of circle is " + (PI * radius * radius) );
	}
	
	
	
	public void sum(int a, int b)
	{
		System.out.println("Sum of two numbers is : " + (a+b));
	}

}
