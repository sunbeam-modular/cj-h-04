package com.sunbeam;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		//Box b1 = new Box(1, 2, 3); 
		//System.out.println(b1.hashCode());
		
		Set<Box> set = new HashSet<Box>( );
		set.add(new Box(1, 2, 3)); 
		set.add(new Box(1, 2, 3)); 
		set.add(new Box(1, 2, 3)); 
		set.add(new Box(1, 2, 3)); 
		
		System.out.println("Size : "+set.size());
	}

}
