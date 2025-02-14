package com.sunbeam;

import java.io.File;
import java.util.Scanner;

public class Program04 {
	
	
	/*
	public static void main(String[] args) {
		// create a directory
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter path of directory to be created: ");
		String path = sc.nextLine();
		File f = new File(path);
		boolean success = f.mkdir();
		System.out.println("Directory Created: " + success);
	}
	*/
	
	/*
	public static void main(String[] args) throws Exception {
		// create a file
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter path of file to be created: ");
		String path = sc.nextLine();
		File f = new File(path);
		boolean success = f.createNewFile();
		System.out.println("File Created: " + success);
	}
	*/
	
	public static void main(String[] args) throws Exception {
		// delete a directory
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter path of file to be deleted: ");
		String path = sc.nextLine();
		File f = new File(path);
		boolean success = f.delete();
		System.out.println("File Deleted: " + success);
	}
	
}
