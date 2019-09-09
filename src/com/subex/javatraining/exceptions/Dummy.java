package com.subex.javatraining.exceptions;

public class Dummy {

	public static void main(String[] args) {
		System.out.println("main start");
		test();
		System.out.println("main ended");
	}

	static void test()
	{
		int a[] = new int[9];
		for (int i = 0; i < 10; i++) 
		{
			try
			{
				a[i] = i;
				System.out.println("Test " + a[i]);
			}
			catch(StringIndexOutOfBoundsException ex)
			{
				ex.printStackTrace();
				System.out.println("Exception occured with a message "  +ex.getMessage());
			}
			catch (ArrayIndexOutOfBoundsException  e) {
				System.out.println("Exception occured with a message "  + e.getMessage());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// TODO: handle exception
			}
			catch(Exception ex)
			{
				System.out.println("Exception handling by Exception class");
			}
		}
	}
}
