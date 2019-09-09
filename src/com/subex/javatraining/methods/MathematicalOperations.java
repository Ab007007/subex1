package com.subex.javatraining.methods;

import java.util.Scanner;

public class MathematicalOperations {

	int sum(int a, int b)
	{
		int c ;
		c = a + b;
//		System.out.println("Sum of two numbers is : " + c);
		return c;
	}
	
	double sum(double d1, double d2)
	{
		double d;
		d = d1 + d2;
	//	System.out.println("Sum of two numbers is : " + d);
		return d;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter first integer number...");
		int a = sc.nextInt();
		System.out.println("Enter Second integer number...");
		int b =  sc.nextInt();
		MathematicalOperations mop = new MathematicalOperations();
		int d = mop.sum(a, b);
		System.out.println("sum of two numbers is " + d);
		sc.close();
	}
	
	
	
}
