package com.sunbeam;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

/*
1. Input a path from user.
2. If path is invalid, print error.
3. If path is of directory, display contents of that directory.
4. If path is of file, display information about that file.
*/

public class Program03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter path: ");
		String path = sc.nextLine();
		
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("Invalid Path.");
			System.exit(0);
		}
		
		if(file.isDirectory()) {
			System.out.println("Directory Listing: ");
			String[] listing = file.list();
			for (String name : listing)
				System.out.println(name);
		}
		else if(file.isFile()) {
			System.out.println("File Information: ");
			System.out.println("File Name: " + file.getName());
			System.out.println("Parent Directory: " + file.getParent());
			System.out.print("File Permissions: ");
			if(file.canRead())
				System.out.print("Read,");
			if(file.canWrite())
				System.out.print("Write,");
			if(file.canExecute())
				System.out.print("Execute");
			System.out.println();
			long modifiedMs = file.lastModified();
			System.out.println("Last Modified: " + new Date(modifiedMs));
		}
		else
			System.out.println("Neither File Nor Directory.");
	}
}



