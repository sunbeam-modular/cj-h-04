package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(); 
		Collections.addAll(set, "A","B","C","D","E","F","G","H","I","J","K"); 
		
		System.out.println("Set : "+set);
		
		System.out.println("First : "+set.first());
		System.out.println("Last : "+set.last());
		
		System.out.println("HeadSet : "+set.headSet("C"));//[A, B]
		System.out.println("TailSet : "+set.tailSet("I"));//[I, J, K]
		System.out.println("Subset : "+set.subSet("A", "F"));//[A, B, C, D, E]
		
		
		System.out.println("Higher : " +set.higher("B") );//C
		System.out.println("Lower : " +set.lower("K") );//J 
		
		//descendingIterator()
		Iterator<String> itr = set.descendingIterator(); 
		while(itr.hasNext()) {
			String ele = itr.next(); 
			System.out.print(ele + " , ");
		}
		System.out.println();
		NavigableSet<String> navgiableSet = set.descendingSet(); 
		System.out.println(navgiableSet);
		
		

	}

}
