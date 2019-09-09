package com.subex.javatraining.constructors;

import java.util.Scanner;

public class SwitchExp {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade");
		int marks = sc.nextInt();
		int m = marks/10;
		switch (m) 
		{
		case 9 :
		case 10 : 
			System.out.println("marks is in 90%");
			
			break;
		case 8 :
			System.out.println("marks is in 80%");
			
			break;
		case 7 :
			System.out.println("marks is in 70%");
			
			break;
			

		default:
			System.out.println("Less than 70");
			break;
		}
	}
}
