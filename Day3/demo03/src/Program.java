import java.util.Scanner;

class Employee{
	//Fields 
	private String name; //Instance variable 
	private int empid; //Instance variable
	private float salary; //Instance variable
	
	//this = emp1 
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		//name = sc.nextLine();
		this.name = sc.nextLine();
		System.out.print("Empid : ");
		//empid = sc.nextInt();
		this.empid = sc.nextInt();
		System.out.println("Salary : ");
		//salary = sc.nextFloat();
		this.salary = sc.nextFloat(); 
	}
	//this = emp1 
	public void printRecord( ) {
		//System.out.println("Name : "+name);
		System.out.println("Name : "+this.name);
		//System.out.println("Empid : "+empid);
		System.out.println("Empid : "+this.empid);
		//System.out.println("Salary : "+salary);
		System.out.print("Salary : "+this.salary);
	}
}
public class Program {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(); // Instantiation 
		emp1.acceptRecord(); // emp1.acceptRecord(emp1) 
		emp1.printRecord(); //  emp1.printRecord(emp1); 
		  
	}
	

}
