package com.sunbeam;
import static com.sunbeam.Chair.setPrice;
import static com.sunbeam.Chair.getPrice;
import static java.lang.Math.*; 
// import all static ( fields + methods) 

import java.util.Scanner;

public class Program {
	public static double calcArea(double rad) {
		return Math.PI * rad * rad; 
	}
	public static void main(String[] args) {
		 
		//static int a = 10; // static local variables are not allowed in java
		
		//Chair.setPrice(500);
		setPrice(500);
		
		//System.out.println("Price : " + Chair.getPrice());
		//System.out.println("Price : " + getPrice());
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the radius :: ");
		double r = sc.nextDouble(); 
		//double area = Program.calcArea(r);
		double area = calcArea(r);
		System.out.println("area : "+area);
	}

}
