class Date{
	//fields 
	int day; 
	int month; 
	int year; 
}
public class Program {

	public static void main(String[] args) {
		Date BirthDate = new Date(); 
		BirthDate.day = 1; 
		BirthDate.month = 1;
		BirthDate.year = 2001; 
		
		System.out.println("Day : "+BirthDate.day);
		System.out.println("Month : "+BirthDate.month);
		System.out.println("Year : "+BirthDate.year);

	}

}
