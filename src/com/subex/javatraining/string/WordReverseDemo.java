package com.subex.javatraining.string;

import java.util.Scanner;

public class WordReverseDemo {

	public static void main(String[] args) {
		//String str= "i'm in Bangalore";
		System.out.println("Please enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		for(String word:words)
		{
			for (int i = word.length()-1; i >=0; i--)
			{
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		
		
	}
}
