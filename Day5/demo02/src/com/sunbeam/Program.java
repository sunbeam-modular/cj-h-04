package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Human[ ] arr = new Human[3]; 
		
		arr[0] = new Human(21, 100, 172);
		arr[1] = new Human(21, 100, 172);
		arr[2] = new Human(21, 100, 172);
		
		for (int i = 0; i < arr.length; i++) {
			  arr[i].display();
		}

	}

}
