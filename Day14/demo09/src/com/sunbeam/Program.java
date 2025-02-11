package com.sunbeam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		//Map<Integer,String> map = new HashMap<Integer, String>( );
		//Map<Integer,String> map = new LinkedHashMap<Integer, String>( );
		//Map<Integer,String> map = new TreeMap<Integer, String>( );
		Map<Integer,String> map = new Hashtable<Integer, String>( );
		map.put(415110, "Karad - Satara"); // retruns -- null
		map.put(411052, "Hinjawadi - Pune"); // retruns -- null
		map.put(411046, "Katraj - Pune"); // retruns -- null
		map.put(400027, "Byculla - Mumbai"); // retruns -- null
		map.put(411002, "Bajirao Rd - Pune"); // retruns -- null
		map.put(411037, "Marketyard - Pune"); // retruns -- null
		map.put(411007, "Aundh - Pune"); // retruns -- null
		map.put(411052, "HINJEWADI - Pune"); // when key is duplicate, value is overwritten
		
		//System.out.println("Size : "+map.size());
		
		/* 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the pin");
		int pin = sc.nextInt(); 
		//String area = map.get(pin); 
		String area = map.getOrDefault(pin, "Area not found"); 
		System.out.println("Area : "+area);
		*/ 
		/* 
		Set<Integer> keys = map.keySet(); 
		System.out.println("Keys : "+keys);
		Collection<String> vals = map.values(); 
		System.out.println("vals : "+vals);
		*/
		Set<Entry<Integer, String>> entSet = map.entrySet(); 
		for (Entry<Integer, String> en : entSet) {
			System.out.println(en.getKey() + " ------------" + en.getValue());
		}
	}

}
