package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>( );
		Collections.addAll(list, 
			    new Book(4, "The Alchemist", "Novel", 493.23),
			    new Book(1, "The Archer", "Novel", 723.53),
			    new Book(5, "The Fountainhead", "Novel", 652.73),
			    new Book(2, "Atlas Shrugged", "Novel", 872.94),
			    new Book(6, "Harry Potter", "Novel", 423.68),
			    new Book(3, "Lord of Rings", "Novel", 621.53)
			);
		
		for (Book bk : list) {
			System.out.println(bk);
		}
		
		System.out.println();
		//random access -- get()
		int index = 3; 
		Book b1 = list.get(index); 
		System.out.println(b1);
		
		System.out.println();
		// searching -- find given element -- indexOf(), lastIndexOf(), contains(), remove(obj)
		// to function these methods correctly, the element class (like Book) must have overridden equals() method
		//	and equals() should compare on desired fields (like id).
		int id = 3;
		Book bk = new Book( ); 
		bk.setId(id);
		int idx = list.indexOf(bk); 
		if(idx!=-1) {
			Book b = list.get(idx); 
			System.out.println("Book found at index " + idx);
		}
		else 
			System.out.println("Not found");
		System.out.println();
		System.out.println("Bidirectional traversal using listIterator (REV)");
		ListIterator<Book> trav = list.listIterator(list.size()); 
		while(trav.hasPrevious()) {
			Book ele = trav.previous(); 
			System.out.println(ele);
		}
		System.out.println();
		
		Collections.sort(list); // natural ordering 
		System.out.println("By ID sort :: ");
		for (Book b : list) {
			System.out.println(b);
		}
		System.out.println();
		
		class BookNameComparator implements Comparator<Book>{

			@Override
			public int compare(Book x, Book y) {
				int diff = x.getName().compareTo(y.getName()); 
				return diff; 
			}
			
		}
		System.out.println("Sort on Name :: ");
		Collections.sort(list, new BookNameComparator());
		for (Book b : list) {
			System.out.println(b);
		}
		System.out.println();
		
		class BookPriceComparator implements Comparator<Book>{

			@Override
			public int compare(Book x, Book y) {
				int diff = Double.compare(x.getPrice(), y.getPrice()); 
				return diff; 
			}
			
		}
		System.out.println("Sort on Price :: ");
		Collections.sort(list, new BookPriceComparator());
		for (Book b : list) {
			System.out.println(b);
		}
		System.out.println();
		Book maxPrice = Collections.max(list, new BookPriceComparator()); 
		System.out.println("Max Price : " + maxPrice);
	}

}
