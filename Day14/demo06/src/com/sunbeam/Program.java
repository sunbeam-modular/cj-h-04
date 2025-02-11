package com.sunbeam;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	
	/* 
	public static void main(String[] args) {
		//Set<Book> set = new HashSet<Book>( );
		Set<Book> set = new LinkedHashSet<Book>(); 
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 423.68));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		
		for (Book bk : set) {
			System.out.println(bk);
		}

	}*/ 
	/* 
	public static void main(String[] args) {
		Set<Book> set = new TreeSet<Book>( );  
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 423.68));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		
		System.out.println("Size : "+set.size());
		
		for (Book bk : set) {
			System.out.println(bk);
		}

	}*/ 
	public static void main(String[] args) {
		
		class BookPriceComparator  implements Comparator<Book>{

			@Override
			public int compare(Book x, Book y) {
				int diff = Double.compare(x.getPrice(), y.getPrice()); 
				return diff; 
			}
			
		}
		
		Set<Book> set = new TreeSet<Book>(new BookPriceComparator());  
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 423.68));
		set.add(new Book(11, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		
		System.out.println("Size : "+set.size());
		
		for (Book bk : set) {
			System.out.println(bk);
		}

	}

}
