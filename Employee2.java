package com.dbda.main;
class EmployeeInfo{
	String name;
	int yearjoining;
	String add;
	
	
	public EmployeeInfo(String name, int yearjoining, String add) {
		super();
		this.name = name;
		this.yearjoining = yearjoining;
		this.add = add;
	}


	@Override
	public String toString() {
		return  name +"      "+  yearjoining +"      " + add ;
	}  
	
}
public class Employee2 {
	public static void main(String[] args) {
		EmployeeInfo[] emp = new EmployeeInfo[3];
		EmployeeInfo e1=new EmployeeInfo("Anuraj", 2023, "Bhor");
		EmployeeInfo e2=new EmployeeInfo("Shubham", 2022, "Pune");
		EmployeeInfo e3=new EmployeeInfo("Rohan", 2024, "Baramati");
		
		System.out.println("Name   "+" Year of joining "+"  Address");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		
	}
}
