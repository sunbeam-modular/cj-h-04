package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
		//List Traversal
		//ArrayList<Double> list = new ArrayList<Double>( );
		//LinkedList<Double> list = new LinkedList<Double>( ); 
		 Vector<Double> list = new Vector<Double>( );  
		   
		 Collections.addAll(list, 1.1,2.1,3.1,4.1,5.1); 
		 
		 System.out.println("for-each loop (Since Java 1.2) ( works for all Collections) ");
		 
		 for (Double ele : list) {
			System.out.println(ele);
		}
		 
		System.out.println("Using Iterator (Since Java 1.2) ( works for all Collections) (list) ");
		Iterator<Double> trav = list.iterator();
		while(trav.hasNext()) {
			Double ele = trav.next(); 
			System.out.println(ele);
		}
		
		System.out.println(" For loop works for all List"); 
		for (int i = 0; i < list.size(); i++) {
				Double ele = list.get(i); 
				System.out.println(ele);
		}
		
		System.out.println("Using Enumeration (Since Java 1.0)(Vector)");
		Enumeration<Double> en = list.elements(); 
		while(en.hasMoreElements()) {
			Double ele = en.nextElement(); 
			System.out.println(ele);
		}
		
		System.out.println("Lambda expression :: ");
		list.forEach(e -> System.out.println(e));
			
	}

}
