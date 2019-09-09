package com.subex.javatraining.threads;

public class EvenNumbers extends Thread
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
