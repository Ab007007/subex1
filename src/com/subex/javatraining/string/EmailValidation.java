package com.subex.javatraining.string;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.print("Please enter the email ID : ");
			String email = sc.next();

			if (email.lastIndexOf("@") == email.indexOf("@")) {
				if (email.endsWith(".com")) {
					int a = email.indexOf("@");
					if (a >= 5) {
						System.out.println(email + "is valid email id");
					} else {
						System.out.println("email id does not contain 6 cahrecter before @");
					}
				} else {
					System.out.println("email ID is not ending with .com");
				}
			} else {
				System.out.println("email ID should have only one @ symbol");
			}
			System.out.println("Do you want to validate one more email ID... yes/no");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
	}
}
