package com.dbda.main;

public class Student1 {
	int roll_num;
	String name;
	long mobile_no;
	String add;
	Student1(int roll_num,String name,long mobile_no,String add) {
		this.roll_num=roll_num;
		this.name=name;
		this.mobile_no=mobile_no;
		this.add=add;
		
	}
	
	void detail() {
		System.out.println("Student name is :"+name+" and Roll number is : "+roll_num);
		System.out.println("The mobile no is : "+mobile_no+" and Address is : "+add);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(1, "Anuraj",546546554,"pune,maharastra");
		s1.detail();
		Student1 s2=new Student1(2, "Shubham", 654654566, "ghulewadi,sangamner");
		s2.detail();
		
		
	}
}
