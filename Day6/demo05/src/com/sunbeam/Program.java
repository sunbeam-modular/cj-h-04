package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		//Singleton s = new Singleton( ); // Error : The constructor singleton is not visible 
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2)
			System.out.println("same obj");
		else 
			System.out.println("different obj");

	}

}
