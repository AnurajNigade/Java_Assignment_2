package com.dbda.main;

public class Car {
	int year;
	String make;
	String model;
	
	Car() {
		year =2010;
		make ="TATA";
		model="NANO";
		
		
	}
	void star_engine() {
		System.out.println("Engine Started");
	}
	void make() {
//		Car c1=new Car();
		System.out.println(make);
//		c1.model();
	}
	void model() {
		System.out.println(model);
	}
	void year() {
		System.out.println(year);
	}

	public static void main(String[] args) {
		Car c1=new Car();
		c1.year=1969;
		c1.make ="Ford";
		c1.model="Mustang";
		
		c1.make();
		c1.model();
		c1.year();
//		c1.star_engine();
		Car c2=new Car();
		c2.make();
		c2.year();
		c2.model();
		
	}

}
