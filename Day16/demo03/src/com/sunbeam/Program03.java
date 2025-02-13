package com.sunbeam;

import java.util.Scanner;

enum Arithmetic {
	EXIT, ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, MODULUS
}

enum Weekday {
	MONDAY() {
		@Override
		public String toString() {
			return "Monday";
		}
	}, 
	TUESDAY() {
		@Override
		public String toString() {
			return "Tuesday";
		}
	}, 
	THURSDAY() {
		@Override
		public String toString() {
			return "Thursday";
		}
	}, 
	FRIDAY() {
		@Override
		public String toString() {
			return "Friday";
		}
	}
}

enum Element {
	H(1, "Hydrogen"), 
	HE(2, "Helium"), 
	LI(3, "Lithium");
	
	private int eleNum;
	private String eleName;
	private Element(int num, String name) {
		this.eleNum = num;
		this.eleName = name;
	}
	public int getEleNum() {
		return eleNum;
	}
	public String getEleName() {
		return eleName;
	}
}

public class Program03 {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result;
		//System.out.println("\n0. Exit\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\nEnter choice: ");
		//int choice = sc.nextInt();
		Arithmetic choice = Arithmetic.MULTIPLICATION;
		switch (choice) {
		case ADDITION:
			result = num1 + num2;
			System.out.println("Result: " + result);
			break;
		case SUBTRACTION:
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case MULTIPLICATION:
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
		case DIVISION:
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result;
		Arithmetic[] arithValues = Arithmetic.values();
		for(Arithmetic ar : arithValues)
			System.out.println(ar.ordinal() + ". " + ar.name());
		System.out.print("Enter choice: ");
		int index = sc.nextInt();
		Arithmetic choice = arithValues[index];
		switch (choice) {
		case ADDITION:
			result = num1 + num2;
			System.out.println("Result: " + result);
			break;
		case SUBTRACTION:
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case MULTIPLICATION:
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
		case DIVISION:
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;
		case MODULUS:
			result = num1 % num2;
			System.out.println("Result: " + result);
			break;
		}
	}
	*/
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result;
		Arithmetic[] arithValues = Arithmetic.values();
		for(Arithmetic ar : arithValues)
			System.out.println(ar.name());
		System.out.print("Enter choice: ");
		String option = sc.next();
		Arithmetic choice = Arithmetic.valueOf(option);
		switch (choice) {
		case EXIT:
			System.exit(0);
			break;
		case ADDITION:
			result = num1 + num2;
			System.out.println("Result: " + result);
			break;
		case SUBTRACTION:
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case MULTIPLICATION:
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
		case DIVISION:
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;
		case MODULUS:
			result = num1 % num2;
			System.out.println("Result: " + result);
			break;
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		for (Weekday day : Weekday.values()) {
			System.out.println(day.ordinal() + " -- " + day.name() + " -- " + day.toString());
		}
	}
	*/
	
	public static void main(String[] args) {
		for (Element e : Element.values()) {
			System.out.println(e.getEleNum() + " --> " + e.getEleName());
		}
	}
}
