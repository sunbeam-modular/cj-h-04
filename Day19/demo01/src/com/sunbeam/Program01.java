package com.sunbeam;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * Input a path from user.
 * If invalid path, give error.
 * If path is of directory, list contents.
 * If path is of file, display information.
 * */

public class Program01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String pathStr = sc.nextLine();
		Path path = Paths.get(pathStr);
		if(! Files.exists(path)) {
			System.out.println("Invalid path.");
			System.exit(0);
		}
		
		if(Files.isDirectory(path)) {
			Files.list(path)
				.forEach(file -> System.out.println(file.getFileName()));
		}
		else if(Files.isRegularFile(path)) {
			System.out.println("File Name: " + path.getFileName());
			System.out.println("Parent Directort: " + path.getParent());
			System.out.println("File Size: " + Files.size(path));
			System.out.print("File Permissions: ");
			if(Files.isReadable(path))
				System.out.print("Read, ");
			if(Files.isWritable(path))
				System.out.print("Write, ");
			if(Files.isExecutable(path))
				System.out.print("Execute");
			System.out.println();
		}
		else
			System.out.println("Neither file nor directory.");
	}
}
