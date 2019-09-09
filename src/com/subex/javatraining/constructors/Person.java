package com.subex.javatraining.constructors;

public class Person
{
	String name;
	int age;
	double height;
	double weight;
	static String country="india";
	static int count=0;
	
	{
		count++;
		
	}
	
	
	public Person() {
		System.out.println("Constructor called...");
	
	}
	
	public Person(String name,int age,double height,double weight)
	{
		System.out.println("Parametarized constructor called....");
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String toString() {
		// TODO Auto-generated method stub
		String str = "The Values of Person Object is\nName : "
				+ this.name + "\n Age : " + this.age + "\n Height :"
				+ this.height + "\n Weight :" + this.weight +
				"\nCountry :" + country  +
				"\n-------------------------------------------------";
	
		return str;
	}
}