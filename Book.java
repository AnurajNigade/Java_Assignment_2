package com.dbda.main;

import java.util.Scanner;

public class Book {
	
	String title;
	String author;
	int publictionYear;
	
	void bookDetails() {
		System.out.println("Author of book is :"+author);
		System.out.println("Title of book is :"+title);
		System.out.println("Year of publication is :"+publictionYear);
	}
	
	public static void main(String[] args) {
		Book p1=new Book();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter title name :");
		p1.title=scanner.nextLine();
		System.out.println("Enter author name :");
		p1.author=scanner.nextLine();
		System.out.println("Enter publication year :");
		p1.publictionYear=scanner.nextInt();
		
		p1.bookDetails();
		
		
		
		
	}
}
