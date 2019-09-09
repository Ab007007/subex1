package com.subex.javatraining.conditional;

import java.util.Scanner;

public class WhileDemo
{
	
	public static void main(String[] args) 
	{
		String choice;
		
		do {
			System.out.println("Please enter the number");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			int i =1;
			while (i<=10) 
			{
				System.out.println(number + " * " + i  + " = " + (number *i));
				i++;
			}
			System.out.println("Do you want to continueeee.....??yes/no");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		
		System.out.println("**** Thank you ****");
		
	}

}
