package com.subex.javatraining.conditional;

import java.util.Scanner;

public class FindGreaterNumber {

	public static void main(String[] args) {
		System.out.println("Program to find greater number");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first integer number");
		int a = sc.nextInt();
		System.out.println("Enter Second integer number");
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println("first integer number is the larger number");
		}
		else if(b>a)
		{
			System.out.println("Second integer number is the larger number");
		}
		else
		{
			System.out.println("Both are equal");
		}
	}
}
