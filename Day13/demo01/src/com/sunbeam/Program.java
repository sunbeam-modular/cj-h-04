package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.domain.Employee;
import com.util.CompareByEmpid;
import com.util.CompareByName;
import com.util.CompareBySalary;

public class Program {
	private static Scanner sc = new Scanner(System.in); 
	public static Employee[ ] getArray( ) {
		Employee[] arr = new Employee[4]; 
		arr[0]  = new Employee("Aditya Patil", 3, 150.00f); 
		arr[1]  = new Employee("Sagar Jadhav", 2, 100.00f); 
		arr[2]  = new Employee("Prashant Bhandare", 1, 300.00f); 
		arr[3]  = new Employee("Rahul Salunkhe", 4, 500.00f); 
		return arr; 
	}
	public static void printRecord(Employee[] arr) {
		if(arr!=null) {
			for (Employee emp : arr) {
				System.out.println(emp.toString()); 
			}
			System.out.println();
		}
	}
	public static int menuList( ) {
		System.out.println("1.Sort by Empid : ");
		System.out.println("2.Sort by Name : ");
		System.out.println("3.Sort by Salary : ");
		System.out.print("Enter the choice :: ");
		int choice = sc.nextInt(); 
		return choice; 
	}
	public static void main(String[] args) {
		int choice; 
		while((choice = menuList())!=0) {
			Employee[] arr = getArray();  
			Comparator<Employee> comparator = null; 
			switch (choice) {
			case 1:
				comparator = new CompareByEmpid( );//polymorphic declaration 
				break;
			case 2: 
				comparator = new CompareByName();//polymorphic declaration 
				break;
			case 3:
				comparator = new CompareBySalary();//polymorphic declaration 
				break;
			}
			Arrays.sort(arr, comparator);
			printRecord(arr);
			
		}

	}

}
