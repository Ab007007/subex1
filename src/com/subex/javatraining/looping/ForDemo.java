package com.subex.javatraining.looping;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the max number to gererate Tabls");
		int maxnum = sc.nextInt();
		for (int i = 1; i <= 10; i++) 
		{
			if(i==maxnum)
			{
				break;
//				continue;
			}
			System.out.println(number + " * " + i  + " = " + (number *i));
		}
	}
}
