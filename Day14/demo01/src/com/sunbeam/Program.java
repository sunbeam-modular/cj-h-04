package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in); 
	private static List<Employee> empList = new ArrayList<Employee>( ); 
	
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[4]; 
		arr[0] = new Employee("Sagar", 3, 1000.00f); 
		arr[1] = new Employee("Prashant", 2, 2000.00f); 
		arr[2] = new Employee("Kunal", 1, 3000.00f); 
		arr[3] = new Employee("Rohit", 4, 5000.00f); 
		return arr; 
	}
	public static void addEmployees(Employee[] employees) {
		for (Employee employee : employees) {
			 empList.add(employee); 
		}
		System.out.println();
	}
	public static void printRecord(Employee employee) {
		if(employee!=null) {
			System.out.println(employee.toString());
		}
		System.out.println();
	}
	public static void acceptRecord(int[] empid) {
		System.out.println("Enter the empid :: ");
		empid[0] = sc.nextInt(); 
	}
	public static Employee findEmployee(int empid) {
			Employee key = new Employee( );  
			key.setEmpid(empid);
			int index = empList.indexOf(key); 
			if(index!=-1) {
				return empList.get(index); 
			}
			else 
				return null; 
			
	}
	public static Boolean removeEmployee(int empid) {
			Employee key = new Employee( ); 
			key.setEmpid(empid);
			if(empList.contains(key)) {
				empList.remove(key); 
				return true; 
			}
			else 
				return false; 
	}
	public static void printEmployees( ) {
		 for (Employee emp : empList) {
			System.out.println(emp.toString());
		}
		 System.out.println();
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.AddEmployees");
		System.out.println("2.FindEmployees");
		System.out.println("3.RemoveEmployees");
		System.out.println("4.PrintEmployees");
		System.out.print("Enter the choice :: ");
		return sc.nextInt(); 
	}
	
	
	public static void main(String[] args) {
		int choice; 
		int[] empid = new int[1];
		while((choice = menuList())!=0) {
			switch (choice) {
			case 1:
				Employee[] emp = Program.getEmployees(); 
				Program.addEmployees(emp);
				break;
			case 2: 
				acceptRecord(empid);
				Employee e = Program.findEmployee(empid[0]); 
				Program.printRecord(e);
			break;
			case 3: 
				acceptRecord(empid);
				Boolean empFound = Program.removeEmployee(empid[0]); 
				System.out.println(empFound ? "Employee removed " : "Empolyee record not found");
				break; 
			case 4: 
				Program.printEmployees(); 
			
			}
		}

	}

}
