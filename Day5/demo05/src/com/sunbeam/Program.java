package com.sunbeam;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int[][] arr) {
		if(arr!=null) {
			for(int row = 0 ; row < arr.length ; row++) {
				for(int col = 0 ; col < arr[row].length ; col++) {
					System.out.print("Enter the element :: ");
					arr[row][col] = sc.nextInt(); 
				}
			}
		}
	}
	private static void printRecord(int[][] arr) {
		if(arr!=null) {
			for(int row = 0 ; row < arr.length ; row++) {
				for(int col = 0 ; col < arr[row].length ; col++) {
					System.out.print(arr[row][col] + "  ");
				}
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Program.acceptRecord(arr);
		
		Program.printRecord( arr ); 

	}

	

}
