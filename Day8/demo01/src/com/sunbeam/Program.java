package com.sunbeam;

import java.util.Objects;

public class Program {

	public static void main(String[] args) {
		Date d1 = new Date(10, 10, 2010); 
		Date d2 = new Date(10, 10, 2010); 
		
		boolean flag = ( d1 == d2); 
		//System.out.println("Comparing the references : " + flag);
		
		flag = d1.equals(d2); 
		//System.out.println("Comparing the instances  : " + flag);
		
		flag = Objects.equals(d1, d2); 
		//System.out.println("Comparing the instances  : " + flag);
	
		flag = d1.equals(null); 
		//System.out.println("Comparing the instances for null  : " + flag);
		
		flag = d1.equals(d1); 
		//System.out.println("Comparing the instances for same   : " + flag);
		
		flag = d1.equals("1-1-2010"); 
		System.out.println("Comparing the instances for same   : " + flag);
	}

}
