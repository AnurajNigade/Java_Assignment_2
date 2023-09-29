package com.dbda.main;

import java.util.Scanner;
//import java.util.jar.Attributes.Name;

public class Person {
	String name;
	int age; 
	String gender;
	void information() {
		System.out.println("Person name is :"+name+" Gender is :"+gender+" and age is :"+age);
	}
	public static void main(String[] args) {
		Person p1=new Person();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of person :");
		p1.name=scanner.nextLine();
		System.out.println("Enter gender of person :");
		p1.gender=scanner.nextLine();
		System.out.println("Enter age of person :");
		p1.age=scanner.nextInt();
		p1.information();
		
	}
}
