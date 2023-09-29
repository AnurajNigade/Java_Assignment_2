package com.dbda.main;

public class Student {
	int age;
	char grade;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//	void name() {
//		System.out.println("Name of student is :"+name);
//	}
//	void age() {
//		System.out.println("Age of student is : "+age);
//		
//	}
//	void grade() {
//		System.out.println("Grade of student is : "+grade);
//		
//	}
	void Display() {
		System.out.println(name +" "+age+" "+grade);
	}
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setName("Anuraj");
		s1.setAge(22);
		s1.setGrade('A');;
		s1.Display();
		
		Student s2=new Student();
		
		s2.setAge(27);
		s2.setName("Shubham");
		s2.setGrade('A');
		s2.Display();
		
		

	}

}
