package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Program05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter source file path: ");
		String srcPath = sc.nextLine();
		System.out.print("Enter dest file path: ");
		String destPath = sc.nextLine();
		int b, count = 0;
		try(FileInputStream fin = new FileInputStream(srcPath)) {
			
			try(FileOutputStream fout = new FileOutputStream(destPath)) {
				
				while( (b = fin.read()) != -1 ) {
					fout.write(b);
					count++;
				}
				
			} // fout.close();
			
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File copied: " + count);
	}
}
