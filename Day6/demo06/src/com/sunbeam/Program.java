package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Emp e1 = new Emp( ); 
		//e1.display();
		System.out.println();
		
		Date d2 = new Date(1, 1, 2000); 
		Emp e2 = new Emp(1, "Aditya", 50000.00, d2); 
		//e2.display();
		System.out.println();
		
		Emp e3 = new Emp( ); 
		e3.accept();
		e3.display();
	}

}
