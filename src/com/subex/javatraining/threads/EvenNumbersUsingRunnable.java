package com.subex.javatraining.threads;

public class EvenNumbersUsingRunnable implements Runnable
{
	
	public void run()
	{
		for (int i = 2; i < 100; i++) 
		{
			System.out.println("evennumbers" + i);
			i++;
		}
		
	}

}
