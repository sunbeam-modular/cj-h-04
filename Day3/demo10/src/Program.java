import java.util.Calendar;
import java.util.Scanner;


class Date{
	
	private int day; 
	private int month; 
	private int year; 
	
	//parameter-less ctor 
	public Date( ) {
		System.out.println("public Date( )");
		Calendar c = Calendar.getInstance(); 
		day = c.get(Calendar.DATE); 
		month = c.get(Calendar.MONTH) + 1; 
		year = c.get(Calendar.YEAR); 
	}
	//parameterized ctor 
	public Date(int day , int month , int year) {
		System.out.println("public Date(int day , int month , int year)");
		this.day = day; 
		this.month = month; 
		this.year = year; 
	}
	
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
		
		Date dt1 = new Date(1, 1, 2020); //parameterized 
		dt1.printRecord();
		
		Date dt2 = new Date(); 
		dt2.printRecord();
		
	}
	public static void main2(String[] args) {
		//ctor is called once per instance according the order of object 
		Date dt1 = new Date(); 
		Date dt2 = new Date(); 
		Date dt3 = new Date(); 
	}
	public static void main1(String[] args) {
		Date dt1 = new Date();
		dt1.printRecord();
		System.out.println();
		dt1.acceptRecord();
		dt1.printRecord();

	}

}
