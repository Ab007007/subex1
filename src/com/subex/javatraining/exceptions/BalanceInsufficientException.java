package com.subex.javatraining.exceptions;

import com.subex.javatraining.accessspecifiers.pack2.B;

public class BalanceInsufficientException extends Exception 
{
	public BalanceInsufficientException() {
		System.out.println("NO BALANCE IN YOUR ACCONT!!!!");
	}
	
	public BalanceInsufficientException(double balance)
	{
		System.out.println("NO BALANCE IN YOUR ACCONT!!!!\n try to withdraw with in " + balance);
		
	}
	
	@Override
	public String getMessage() {
		return "check your balance before performing the transaction!!!!";
	}
}
