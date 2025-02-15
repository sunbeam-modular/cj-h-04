package com.sunbeam;

import java.io.FileInputStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program05 {
	static final String EMP_FILE = "C:/Nilesh/onlinecourses/CJ-H-02/day18/emp.csv";
	/*
	public static void main(String[] args) {
		// read any text file line by line
		try(FileInputStream fin = new FileInputStream(EMP_FILE)) {
			try(Scanner sc = new Scanner(fin)) {
				while(sc.hasNextLine()) {
					String line = sc.nextLine();
					System.out.println(line);
				}
			} // sc.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	public static Emp parseEmp(String line) {
		String[] parts = line.split(",");
		int empno = Integer.parseInt(parts[0]);
		String ename = parts[1];
		String job = parts[2];
		int mgr;
		try {
			mgr = Integer.parseInt(parts[3]);
		} catch (NumberFormatException ex) {
			mgr = 0;
		}
		String hire = parts[4];
		int sal = (int)Double.parseDouble(parts[5]);
		int comm;
		try {
			comm = (int)Double.parseDouble(parts[6]);
		} catch (NumberFormatException ex) {
			comm = 0;
		}
		int deptno = Integer.parseInt(parts[7]);
		Emp e = new Emp(empno, ename, job, mgr, hire, sal, comm, deptno);
		return e;
	}
	
	/*
	public static void main(String[] args) {
		// read any text file line by line
		List<Emp> list = new ArrayList<>();
		try(FileInputStream fin = new FileInputStream(EMP_FILE)) {
			try(Scanner sc = new Scanner(fin)) {
				while(sc.hasNextLine()) {
					String line = sc.nextLine();
					Emp e = parseEmp(line);
					//System.out.println(e.toString());
					list.add(e);
				}
			} // sc.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}	
		// sum of sal of all managers
		int total = 0;
		for (Emp e : list) {
			if(e.getJob().equals("MANAGER"))
				total = total + e.getSal();
		}
		System.out.println("MANAGER Total Salary: " + total);
	}
	*/
	
	public static void main(String[] args) {
		//Path path = Path.of(EMP_FILE); // Since Java 11
		Path path = Paths.get(EMP_FILE); // Since Java 7
		try(Stream<String> strm = Files.lines(path)) {
			String job = "ANALYST";
			int total = strm								// Stream<String>
					.map(line -> parseEmp(line))			// Stream<Emp>
					.filter(e -> e.getJob().equals(job))	// Stream<Emp> with all ANALYST
					.mapToInt(e -> e.getSal())				// IntStream
					.sum();									// terminal operation
			System.out.println(job + " Total Salary: " + total);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}















