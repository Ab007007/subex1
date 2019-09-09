package com.subex.javatraining.exceptions;

import java.io.FileNotFoundException;

public class ThrowsDemo 
{
	
	public static void test1() throws FileNotFoundException,Exception
	{
		System.out.println("test1");
		throw new Exception();
//		System.out.println("test ended..??");
	}

	
	public static void main(String[] args) 
	{
		System.out.println("main started");
		try
		{
		
			test1();
		}
		catch(Exception ex)
		{
			System.out.println("00000");
		}
		System.out.println("main ended");
	}
	
	
}
