package com.subex.javatraining.string;

public class StringDemo 
{
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		str1 = str1.concat("123");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str1 = str1.concat("456");
		System.out.println(str1);
		System.out.println(str1.hashCode());
	}

}
