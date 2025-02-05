package com.sunbeam;

import java.util.Scanner;

public class Program {
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the number :: ");
		int num = sc.nextInt(); 
		System.out.println("Square : " + num * num);

	}*/ 
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the number :: ");
		int num = sc.nextInt(); 
		System.out.println("Square : " + num * num);
		sc.close();//resource is closed 

	}*/ 
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the number :: ");
		int num = sc.nextInt(); 
		System.out.println("Square : " + num * num);
		System.out.println("Resource closed ...");
		sc.close();//resource is closed 

	}*/ 
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the number :: ");
			int num = sc.nextInt();
			System.out.println("Square : " + num * num);
			System.exit(0);

		} finally {
			System.out.println("Resource closed...");
			sc.close();// resource is closed
		}
	}*/ 
	/*
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the number :: ");
			int num = sc.nextInt();
			System.out.println("Square : " + num * num);
		}//sc.close() called automatically 
	}*/ 
	public static void main(String[] args) {
		class MyResource implements AutoCloseable {
			
			public MyResource() {
				System.out.println("Resource initiated...");
			}
			@Override
			public void close() {
				System.out.println("Resource closed");
				
			}
			
		}
		try(MyResource mr = new MyResource()){
			System.out.println("Resources started...");
		}// mr.close(); 
	}

}
