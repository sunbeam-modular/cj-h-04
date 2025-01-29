import java.util.Scanner;

//Step 1 : Understand requirement and Declare the class
class Date{
	//Step 2: Declare the fields
	//Step 4: access modifiers
	private int day; 
	private int month; 
	private int year; 
	
	//this = dt1; 
	public void acceptRecord( )
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Day : ");
		day = sc.nextInt(); 
		System.out.print("Month : ");
		month = sc.nextInt(); 
		System.out.print("Year : ");
		year = sc.nextInt(); 
	}
	public void printRecord( ) {
		System.out.println("Day : "+this.day);
		System.out.println("Month : "+this.month);
		System.out.println("Year : "+this.year);
	}
	
}
public class Program {

	public static void main(String[] args) {
		//step3 : Creating the instance
		Date dt1 = new Date(); 
		
		//step5:: calling methods
		dt1.acceptRecord( );  // dt1.acceptRecord(dt1); 
		dt1.printRecord( );  // dt1.printRecord(dt1); 

	}

}
