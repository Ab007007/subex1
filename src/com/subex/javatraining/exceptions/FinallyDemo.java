package com.subex.javatraining.exceptions;

public class FinallyDemo 
{
	public static void main(String[] args) {
		System.out.println("main started ");
		try
		{
			String str = null;
			System.out.println("length of the string " + str.length());
//			System.out.println("I'm after exception");
		}
		catch(NullPointerException ex )
		{
			System.out.println("excepiton occured...");
			
		}
		finally
		{
			System.out.println("I'm after exception");
		}
		System.out.println("main ended ");
	}
	

}
