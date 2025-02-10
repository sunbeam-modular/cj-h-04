package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>( );
		list.add("India"); 
		list.add("USA");
		list.add("China");
		list.add("Russia");
		list.add("India"); 
		list.add("England");
		list.add("Germany");
		
		System.out.println("Size : "+list.size());
		//random access 
		int index = 3; 
		list.add(index, "Isreal");
		
		System.out.println("List : "+list.toString());
		
		//get() --random access -- get element at index
		String e5 = list.get(index); 
		System.out.println("Ele : " +e5);
		
		e5 = e5.toUpperCase(); 
		
		//set()	---(random access --- set overwrite element at the index
		list.set(index, e5); 
		
		System.out.println("List : "+list.toString());
		
		//remove() ---- random access - delete the element at index 
		
		list.remove(index); 
		
		System.out.println("List : "+list.toString());
		
		//contains()---- searching -- inherited from collection
		String find = "USA"; 
		boolean found = list.contains(find); 
		if(found)
			System.out.println("Ele : " + find + " found " );
		else 
			System.out.println("Ele not found");
		
		//indexOf() , lastIndexOf() -- (find the element and access it )
		int idx = list.indexOf(find); 
		if(idx!=-1)
			 System.out.println("Element found at index " + idx );
		else 
			 System.out.println("Element not found");
		
		idx = list.lastIndexOf(find); 
		if(idx!=-1)
			 System.out.println("Element found at index " + idx );
		else 
			 System.out.println("Element not found");
		
		System.out.println();
		System.out.println("FWD traversal :: ");
		ListIterator<String> trav = list.listIterator(); 
		while(trav.hasNext()) {
			String ele = trav.next(); 
			System.out.println(ele);
		}
		
		System.out.println();
		
		System.out.println("REV TRAVERSAL : ");
		trav = list.listIterator(list.size()); 
		while(trav.hasPrevious()) {
			String ele = trav.previous(); 
			System.out.println(ele);
		}
		System.out.println();
		list.clear(); 
		Collections.addAll(list,"Akash","Prashant","Sagar","Rahul","Aditya"); 
		System.out.println("List : "+list.toString());
		Collections.sort(list);
		System.out.println("List : "+list.toString());
		Collections.shuffle(list); 
		System.out.println("List : "+list.toString());
		
		class StringComparator implements Comparator<String>{

			@Override
			public int compare(String x, String y) {
				 int diff = -x.compareTo(y); 
				 return diff; 
			}
			
		}
		System.out.println();
		Collections.sort(list, new StringComparator());
		System.out.println("List : "+list.toString());
		
	}

}
