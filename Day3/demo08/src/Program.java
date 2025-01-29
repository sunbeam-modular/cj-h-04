
public class Program {

	public static void main(String[] args) {
		int a = 10; //  Initialization
		//Initialization can be done only once 
		//int a = 20; // NOT OK 
	}
	public static void main1(String[] args) {
		int a = 10; // Initialization 
		a = 20;  //assignment 
		//Assignment can be done multiple number of times
		System.out.println("a : " + a);//20 
		a = 30; 
		System.out.println("a : " + a);//30 
		a = 40; 
		System.out.println("a : " + a);//40
		 
	}

}
