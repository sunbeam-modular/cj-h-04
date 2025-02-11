package demo05;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>( );
		//Set<String> set = new LinkedHashSet<String>();
		Set<String> set = new TreeSet<String>();
		set.add("India");// return true 
		set.add("USA");// return true
		set.add("China");// return true
		set.add("Russia");// return true
		set.add("India");// return false --- already exist 
		set.add("Nepal");// return true
		set.add("Russia");// return false -- already exist 
		set.add("Nepal");// return false -- already exist
		
		System.out.println("Size : "+set.size()); 
		
		for (String str : set) {
			System.out.println(str);
		}
	}

}
