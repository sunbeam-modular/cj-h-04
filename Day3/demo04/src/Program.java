import java.util.Scanner;

class Employee{
	//Fields 
	private String name; //Instance variable 
	private int empid; //Instance variable
	float salary; //Instance variable
	
	//this = emp1 
	//setter / mutator 
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	//getter / inspector 
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//this = emp1 
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		//name = sc.nextLine();
		this.name = sc.nextLine();
		System.out.print("Empid : ");
		//empid = sc.nextInt();
		this.empid = sc.nextInt();
		System.out.print("Salary : ");
		//salary = sc.nextFloat();
		this.salary = sc.nextFloat(); 
	}
	//facilitator 
	//this = emp1 
	public void printRecord( ) {
		//System.out.println("Name : "+name);
		System.out.println("Name : "+this.name);
		//System.out.println("Empid : "+empid);
		System.out.println("Empid : "+this.empid);
		//System.out.println("Salary : "+salary);
		System.out.println("Salary : "+this.salary);
	}
}
public class Program {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(); // Instantiation 
		emp1.acceptRecord(); // emp1.acceptRecord(emp1) 
		emp1.printRecord(); //  emp1.printRecord(emp1); 
		emp1.setSalary(20000.00f);
		System.out.println("Updated salary is " + emp1.getSalary());
	}
	

}
