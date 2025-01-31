package com.sunbeam;

public class Program{
	public static void arrayPrint(Object... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		arrayPrint(11,3.14,"Hello"); 
	}
}
/*
public class Program{
	public static double arraySum(double... arr) {
		double total = 0.0; 
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i]; 
		}
		return total; 
		
	}
	public static void main(String[] args) {
		double r1 = arraySum(1.1,2.1);
		System.out.println("r1 : "+r1);
		
		double r2 = arraySum(1.1,2.1,3.1);
		System.out.println("r1 : "+r2);
		
		double r3 = arraySum(1.1,2.1,3.1,4.1);
		System.out.println("r1 : "+r3);
	}
}
*/
/*
public class Program{
	public static double arraySum(double[] arr) {
		double total = 0.0; 
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i]; 
		}
		return total; 
		
	}
	public static void main(String[] args) {
		double[] a1 = {1.2,1.3};
		double r1 = arraySum(a1); 
		System.out.println("Res : " + r1);
		
		double[] a2 = {1.0,2.0,3.0};
		double r2 = arraySum(a2);   
		System.out.println("Res : " + r2);
		
		double r3 = arraySum(new double[] {1.1,2.1,3.1}); 
		System.out.println("Res : " + r3);
	}

	
}
*/ 

/*
public class Program {
	public static void sum(int a, int b) {
		int r = a + b; 
		System.out.println("res : "+r);
		
	}
	public static void sum(int a, int b , int c) {
		int r = a + b + c ; 
		System.out.println("res : "+r);
		
	}
	public static void sum(int a, int b, int c , int d) {
		int r = a + b + c + d; 
		System.out.println("res : "+r);
		
	}
	public static void main(String[] args) {
		//method overloading  -- same name but different number of arguments 
		
		sum(10,2); 
		sum(10,2,3); 
		sum(10,2,3,4); 

	}

	

}
*/ 