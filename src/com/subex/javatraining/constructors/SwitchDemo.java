package com.subex.javatraining.constructors;

import java.util.Scanner;

public class SwitchDemo 
{
	public static void main(String[] args) {
		
		/*
		 * switch (key) { case value:
		 * 
		 * break;
		 * 
		 * default: break; }
		 */
		
		System.out.println("Find Marks of a Student based on Grade");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade");
		String grade = sc.next();
		
		switch (grade) 
		{
		case "A":
		case "a":
			System.out.println("your marks is greater than 90");
			break;
		case "B":
			System.out.println("your marks is greater than 80 and less then 90");
			break;
		case "C":
			System.out.println("your marks is greater than 60 and less then 80");
			break;
		case "D":
			System.out.println("your marks is tooo lowww... contact your head master");
			break;
		default:
			System.out.println("Did not match any Case..!!!! contact Admin");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
