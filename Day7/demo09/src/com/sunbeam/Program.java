package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Date dt1 = new Date(1, 1, 2010); 
		System.out.println("dt1 : "+dt1.toString());
		// d1 = com.sunbeam.Date@3d012ddd <-- when not overridden
		// Object.toString() returns class name @ hashcode in hex
		

	}

}
