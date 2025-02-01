package com.sunbeam;

class Math {
	public static int pow(int base, int index) {
		int result = 1;
		for (int count = 1; count <= index; count++) {
			result = result * base;
		}
		return result;
	}

}	

public class Program {

	public static void main(String[] args) {
		Math m = new Math();
		int result = Math.pow(2, 3); 
		System.out.println("Result : "+result);
				

	}

}
