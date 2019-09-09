package com.subex.javatraining.constructors;


public class PersonManager {

	@Override
	public String toString() {
		return "Person manager Object";
	}
	static
	{
		System.out.println("I'm executing before main...");
	}
	public String get(int a)
	{
		return "i'm printing from personmanager" + a;
	}
	public String get()
	{
		return "i'm printing from personmanager";
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Started...");
		Person p1 = new Person();
		Person p2 = new Person();
		p1.name = "Aravinda";
		p1.age = 35;
		p1.height = 6.6;
		p1.weight = 80.5;
			System.out.println(p1);	
		//printPersonValues(p1);
	
		p2.name = "PQR";
		p2.age = 35;
		p2.height = 6.6;
		p2.weight = 80.5;
	//	printPersonValues(p2);
		System.out.println(p2);
		
		Person p3 = new Person("ABCD",22,22.2,33.2);
		System.out.println(p3);
		System.out.println("total number of Person objects : " + Person.count);
		
	}

	private static void printPersonValues(Person p1) {
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		System.out.println(Person.country);
	}

}









