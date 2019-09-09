package com.subex.javatraining.conditional;

public class PrintArrayInReverse {

	
	public static void main(String[] args) {
		
		String str[] = new  String[5];
		
		str[0] = "Subex1";
		str[1] = "Subex2";
		str[2] = "Subex3";
		str[3] = "Subex4";
		str[4] = "Subex5";
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
	
	}
}
