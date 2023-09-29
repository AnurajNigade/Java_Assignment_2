package com.dbda.main;

public class Bankaccount {
	
	int accNum;
	String accHolder;
	static double balance;
	
//	public int getAccNum() {
//		return accNum;
//	}


	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}


//	public String getAccHolder() {
//		return accHolder;
//	}


	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}


//	public double getBalance() {
//		return balance;
//	}


	public void setBalance(double bal) {
		balance = bal;
	}


	void addMoney(double amount) {
		balance+=amount;
	}
	void withdraw(double amount) {
		balance-=amount;
	}
	void accDetails() {
		System.out.println("User name is :"+accHolder+" account number is :"+accNum+" and balance is :"+balance);
	}


	public static void main(String[] args) {
		
		Bankaccount u1=new Bankaccount();
		Bankaccount u2=new Bankaccount();
		u1.setAccNum(1);
		u1.setAccHolder("Anuraj");
		u1.setBalance(1000);
		u1.accDetails();
		
		u1.addMoney(1000);
		u1.accDetails();
		u1.withdraw(500);
		u1.accDetails();
		u2.accDetails();//  This will show previous balance due to static variable
		
		
		
	}
}
