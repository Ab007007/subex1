package com.subex.javatraining.abstractdemo;

public class Lion 
{

	public static void main(String[] args)
	{
		Animal a = new Animal() 
		{
			
			@Override
			public void family() {
				// TODO Auto-generated method stub
				System.out.println("I'm the king of forest");
			}
			
		};		
		
		Animal dog = new Animal() {
			
			@Override
			public void family() {
				// TODO Auto-generated method stub
				System.out.println("i belongs to dog");
			}
		};
		
		Animal cat = new Animal() {
			
			@Override
			public void family() {
				// TODO Auto-generated method stub
				System.out.println("I belongs to cat..");
			}
		};
		a.family();
		dog.family();
		cat.family();
	}
}
