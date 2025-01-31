package com.sunbeam;
class Employee{
	private String name; 
	private int empid; 
	private float salary;
	public Employee() {
		this("", 0, 0.0f); 
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	} 
	public void printRecord( ) {
		System.out.printf("Name = %s empid = %d salary = %f\n",this.name,this.empid,this.salary);
	}
	
}
public class Program {
	private static Employee[] getInstance() {
		Employee[] arr = new Employee[3]; 
		arr[ 0 ] = new Employee("Amit",11, 25000.50f);
		arr[ 1 ] = new Employee("Chetan",12, 35000.50f);
		arr[ 2 ] = new Employee("Digvijay",13, 45000.50f);
		return arr; 
	}
	public static void printRecord(Employee[ ] arr) {
		if(arr!=null) {
			for (Employee emp : arr) {
				emp.printRecord();
			}
		}
		
	}
	public static void main(String[] args) {
		Employee[] arr = Program.getInstance( );
		
		Program.printRecord(arr); 
	}
	
	

	public static void main3(String[] args) {
		Employee[] arr = new Employee[3]; 
		arr[ 0 ] = new Employee("Amit",11, 25000.50f);
		arr[ 1 ] = new Employee("Chetan",12, 35000.50f);
		arr[ 2 ] = new Employee("Digvijay",13, 45000.50f);
		for (Employee emp : arr) {
			emp.printRecord();
		}
	}
	public static void main2(String[] args) {
		/* 
		Employee[] arr = new Employee[3]; 
		
		arr[0] = new Employee(); 
		arr[1] = new Employee(); 
		arr[2] = new Employee(); 
	  	
	  	*/ 
		
		//Employee[] arr = new Employee[] {new Employee() , new Employee() , new Employee()}; 
		Employee[] arr = new Employee[3];
		for(int index = 0 ; index < 3 ; index ++ ) {
			arr[index ] = new Employee(); 
		}
		for(int index = 0 ; index < 3 ; index ++ ) {
			arr[index].printRecord(); 
		}
	}
	public static void main1(String[] args) {
		Employee[ ] arr; // Reference of Employee array; 
		arr = new Employee[3]; 
		System.out.println(arr[0]); // null 
		System.out.println(arr[1]); // null
		System.out.println(arr[2]); // null 
		
		for(int index = 0 ; index < 3 ; index++) {
			arr[index].printRecord(); // null pointer exception 
		}
	}

}
