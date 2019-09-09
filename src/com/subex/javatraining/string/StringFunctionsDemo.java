package com.subex.javatraining.string;

public class StringFunctionsDemo {

	public static void main(String[] args) {
		String str = "Aravinda;25;bangalore";
		System.out.println(str);
		System.out.println("Length of a String  : " +str.length());
		System.out.println("Character at index 2 : " + str.charAt(2));
		System.out.println("Index of a Character : " + str.indexOf("a",2));
		System.out.println("Last Index of a Character : " + str.lastIndexOf("a"));
		System.out.println("UpperCase : " + str.toUpperCase());
		System.out.println("LowerCase : " + str.toLowerCase());
		System.out.println("Sub String from 3 " + str.substring(3));
		System.out.println("Sub String from 3 to 5 " + str.substring(3,5));
	
		String[] details = str.split(";");
		for(String s:details)
		{
			System.out.println(s);
		}
		
	}
}
