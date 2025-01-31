package com.sunbeam;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in); 
	public static void printRecord(int[] arr) {
		if(arr!=null) {
			for(int index = 0; index < 3 ; index++) {
				System.out.println(arr[index]);
			}
		}
		
	}
	public static void acceptRecord(int[] arr) {
		if(arr!=null) {
			for(int index = 0 ; index < 3 ; index++) {
				System.out.print("Enter element : ");
				arr[index] = sc.nextInt(); 
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[ ] arr = new int[ ]{10,20,30,40,50}; 
		//for-each is read-only loop and forward only loop 
		for(int element : arr) // for-each element in arr 
			System.out.println(element);
	}
	public static void main8(String[] args) {
		int[] arr1 = new int [3]; // OK 
		int[] arr2 = new int[ ] {10,20,30}; // OK 
		//int[] arr3 = new int[3] {10,20,30}; // NOT OK
		int[] arr4 = new int [-3]; // negative array size exception 
		int[] arr5 = {10,20,30}; // OK 
		int arr6[] = {10,20,30}; // OK 
	}
	public static void main7(String[] args) {
		int[ ]arr = null;
		arr = new int[3]; 
		Program.acceptRecord(arr); 
		Program.printRecord(arr); 
	}
	
	public static void main6(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[ ] arr = new int[3]; 
		for(int index = 0 ; index < 3 ; index++) {
			System.out.print("Enter Element : ");
			arr[index] = sc.nextInt(); 
		}
		for(int index = 0 ; index < 3 ; ++index)
			 System.out.println(arr[index]);
	}
	public static void main5(String[] args) {
		int[ ] arr = new int[3]; 
		arr[0] = 10; 
		arr[1] = 20; 
		arr[2] = 30;
		
		//System.out.println(arr[-1]); // ArrayIndexOutOfBoundsException 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	public static void main4(String[] args) {
		int[ ] arr = new int [ -3 ]; //NegativeArraySizeException 
	}
	public static void main3(String[] args) {
		int[ ] arr = new int [ 3 ]; 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	public static void main2(String[] args) {
		int[ ] arr = null; 
		arr = new int[ 3 ]; 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	public static void main1(String[] args) {
		//int arr1[ ]  = null; // OK // Array reference  : OK 
		//int [ arr2 ] = null; // NOT OK  
		//int[ ] arr3 = null; // Array reference : OK 
		
	}

}
