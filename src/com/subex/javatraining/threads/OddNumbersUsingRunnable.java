package com.subex.javatraining.threads;

public class OddNumbersUsingRunnable implements Runnable
{
	
	public void run()
	{
		for (int i = 1; i < 100; i++) 
		{
			System.out.println("Oddnumbers " + i);
			i++;
		}
		
	}

}
