package com.dbda.main;

import java.util.Scanner;

public class Employee {
	
	String Name;
	int EmpID;
	double Salary;
	void Increment(double amount) {
		Salary+=amount;
		
	}

	void AcceptRecord(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID of Employee :");
		EmpID=sc.nextInt();
		
		sc.nextLine(); //It will eliminate enter effect while getting string data
		
		System.out.println("Enter Name of Employee :");
		Name=sc.nextLine();
		System.out.println("Enter salary of Employee :");
		Salary=sc.nextDouble();
		
		
	}
	void EmpDetail() {
		System.out.println("Name : "+Name+" Emp ID: "+EmpID+" Salary :"+Salary);
	}
	public static void main(String[] args) {
		Employee E1=new Employee();
		E1.AcceptRecord();
		E1.EmpDetail();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount of salary you want to increase for user:  ");
		double amt=sc.nextDouble();
		E1.Increment(amt);
		
		E1.EmpDetail();
		
	}
}
