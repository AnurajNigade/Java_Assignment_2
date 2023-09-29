package com.dbda.main;

public class CarRace{
	int Speed;
	
	static void Compare(CarRace e,CarRace f) {
		if (e.Speed > f.Speed) {
			System.out.println("Car1 is faster than Car2");
		}
		else {
			
			System.out.println("Car2 is faster than Car1");
		}
		
	}
	public static void main(String[] args) {
		CarRace c1=new CarRace();
		CarRace c2=new CarRace();
		
		c1.Speed=1000;
		c2.Speed=120;
		
		CarRace.Compare(c1,c2);
		
		
	}

}
