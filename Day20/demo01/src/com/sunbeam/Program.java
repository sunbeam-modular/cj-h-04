package com.sunbeam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Employee implements Serializable {
	private String name;
	private int empid;
	private float salary;

	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public Employee() {
		this("", 0, 0.0f);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-20d%10.2f", this.name, this.empid, this.salary);
	}

}

public class Program {
	private static List<Employee> empList = new ArrayList<Employee>();
	private static Scanner sc = new Scanner(System.in);

	public static Employee[] getEmployees() {
		Employee[] arr = new Employee[4];
		arr[0] = new Employee("Amit", 50, 50000);
		arr[1] = new Employee("Umesh", 10, 40000);
		arr[2] = new Employee("Soham", 40, 30000);
		arr[3] = new Employee("Rupesh", 20, 20000);
		return arr;
	}

	public static void addEmployees(Employee[] employees) {
		for (Employee emp : employees) {
			empList.add(emp);
		}
	}

	public static void acceptRecord(int[] empid) {
		System.out.print("Enter the empid : ");
		empid[0] = sc.nextInt();
	}

	public static Employee findEmployee(int empid) {
		Employee key = new Employee();
		key.setEmpid(empid);
		int index = empList.indexOf(key);
		if (index != -1) {
			return empList.get(index);
		} else
			return null;
	}

	public static boolean removeEmployee(int empid) {
		Employee key = new Employee();
		key.setEmpid(empid);
		if (empList.contains(key)) {
			empList.remove(key);
			return true;
		} else
			return false;
	}

	public static void printRecord(Employee emp) {
		if (emp != null) {
			System.out.println(emp.toString());
		} else
			System.out.println("Employee not found");
	}

	public static void printEmployees() {
		empList.sort((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		empList.forEach(System.out::println);
	}

	public static void writeRecord(String path) throws Exception {
		try (FileOutputStream fout = new FileOutputStream(path)) {
			try (BufferedOutputStream bout = new BufferedOutputStream(fout)) {
				try (ObjectOutputStream oout = new ObjectOutputStream(bout)) {
					oout.writeObject(empList);
				} // out.close();
			} // bout.close();
		} // fout.close();
	}

	public static void readRecord(String path) throws Exception {
		try (FileInputStream fin = new FileInputStream(path)) {
			try (BufferedInputStream bin = new BufferedInputStream(fin)) {
				try (ObjectInputStream oin = new ObjectInputStream(bin)) {
					empList = (List<Employee>) oin.readObject();
				} // oin.close();
			} // bin.close();
		} // fin.close();
	}

	public static int menu_List() {
		System.out.println("0.Exit");
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Print Employee[ Sorted ]");
		System.out.println("5.Write Record");
		System.out.println("6.Read Record");
		System.out.print("Enter the choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int[] empid = new int[1];
		int choice;
		while ((choice = menu_List()) != 0) {

			try {
				switch (choice) {
				case 1:
					empList.clear(); 
					Employee[] emp = Program.getEmployees();
					Program.addEmployees(emp);
					break;
				case 2:
					Program.acceptRecord(empid);
					Employee e = Program.findEmployee(empid[0]);
					Program.printRecord(e);
					break;
				case 3:
					Program.acceptRecord(empid);
					boolean empFound = Program.removeEmployee(empid[0]);
					System.out.println(empFound ? "Employee removed " : "Empolyee not found / exist");
					break;
				case 4:
					Program.printEmployees();
					break;
				case 5:
					Program.writeRecord("Employees.db");
					break;
				case 6:
					Program.readRecord("Employees.db");
					Program.printEmployees();
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Message : "+e.getMessage());
			}

		}

	}

}
