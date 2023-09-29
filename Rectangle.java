package com.dbda.main;

import java.util.Scanner;

public class Rectangle {
	
	double length;
	double width;
	
	void area() {
		System.out.println("Area of rectangle is :"+ length*width);
	}
	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length of rectangle :");
		r1.length=scanner.nextDouble();
		System.out.println("Enter width of rectangle :");
		r1.width=scanner.nextDouble();
		
		r1.area();
		scanner.close();
	}
}
