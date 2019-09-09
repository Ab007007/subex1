package com.subex.javatraining.exceptions;

import java.util.Scanner;

public class AmountWithdraw 
{
	static double balance = 10000;
	
	public static void main(String[] args) {
		System.out.println("Welcome to withdraw Amount");
		Scanner sc = new Scanner(System.in);
		int amount = 0;
		String choice=null;
		do
		{
			System.out.println("your current balance is " + balance);
			System.out.println("Enter the amount you want to withdraw...");
			try
			{
				amount = sc.nextInt();
			}
			catch (Exception e)
			{
				System.out.println("Please enter only integer ");
				System.exit(100);
			}
			double tempBalance = balance;
			
			tempBalance  = tempBalance - amount;
			if(tempBalance<0)
			{
				try
				{
					throw new BalanceInsufficientException(balance);
				}
				catch(BalanceInsufficientException ex)
				{
					System.out.println("Transaction Failed!!! try to withdraw with in " + balance);
				}
			}
			else
			{
				System.out.println("Amount " + amount + " debited successfully.. and your "
						+ "balance is " + tempBalance);
				balance = tempBalance;
			}
			System.out.println("Do you want to perform one more transaction");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you for your transaction!!!!");
	
	
	
	}
	

}
