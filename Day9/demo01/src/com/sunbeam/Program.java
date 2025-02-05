package com.sunbeam;

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Aditya", 60, 172, new Date(1, 1, 2020)); 
		Person p2 = (Person) p1.clone( );  
		
		System.out.println("P1 : "+p1.toString());
		System.out.println("P2 : "+p2.toString());
		
		p1.getBirth().setDay(23);
		p1.getBirth().setMonth(2);
		p1.getBirth().setYear(2012);
		
		System.out.println();
		System.out.println("P1 : "+p1.toString());
		System.out.println("P2 : "+p2.toString());
	}

}
