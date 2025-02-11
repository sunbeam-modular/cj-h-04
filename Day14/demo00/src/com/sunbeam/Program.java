package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static List<Employee>empList = new ArrayList<Employee>( ); 
	
	public static Employee[] getEmployees() {
		Employee[] arr = new Employee[5];
		arr[ 0 ] = new Employee("Amit", 50,50000);
		arr[ 1 ] = new Employee("Umesh", 10,40000);
		arr[ 2 ] = new Employee("Soham", 40,30000);
		arr[ 3 ] = new Employee("Rupesh", 20,20000);
		arr[ 4 ] = new Employee("Sanjay", 30,10000);
		return arr; 
	}
	public static void addEmployee(Employee[] employees) {
			for (Employee employee : employees) {
				  empList.add(employee); 
			}
	}
	public static void acceptRecord(int[ ] empid) {
		System.out.print("Enter empid : ");
		empid[0] = sc.nextInt(); 
	}
	public static Employee findEmployee(int empid) {
		Employee key = new Employee( ); 
		key.setEmpid(empid);
		int index = empList.indexOf(key); 
		if(index!=-1)
			return empList.get(index); 
		return null; 
	}
	public static void printRecord(Employee emp) {
		if(emp!=null)
			System.out.println(emp.toString());
		else 
			System.out.println("Employee not found");
	}
    public static boolean removeEmployee(int empid) {
		Employee key = new Employee( ); 
		key.setEmpid(empid);
		if(empList.contains(key)) {
			empList.remove(key); 
			return true; 
		}
		return false; 
	}
	public static void printEmployees() {
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}
		System.out.println();
	}
	public static int menuList()
	{
		System.out.println("*********************************");
		System.out.println("0.Exit");
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Print Employee[ Sorted ]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice; 
		int[] empid = new int[1]; 
		while((choice = menuList())!=0) {
			switch (choice) {
			case 1:
				Employee[] employees = Program.getEmployees(); 
				Program.addEmployee(employees);
				break;
			
			case 2: 
				 Program.acceptRecord(empid);
				 Employee emp = Program.findEmployee(empid[0]); 
				 Program.printRecord(emp);
				 break; 
			case 3: 
				 Program.acceptRecord(empid);
				 boolean removedStatus = Program.removeEmployee(empid[0]);
				 System.out.println(removedStatus ? "Employee is removed " : "Employee is not removed");
				 break; 
			case 4: 
				Program.printEmployees();
				break;
			} 
			
		}

	}

}
