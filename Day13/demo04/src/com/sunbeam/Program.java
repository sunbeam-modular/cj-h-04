package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Program {
	
	/* 
	public static void main(String[] args) {
		// Fail-fast Iterator 
		List<Double> list = new ArrayList<Double>();
		Collections.addAll(list, 1.1, 2.1, 3.1, 4.1, 5.1);
		Iterator<Double> itr = list.iterator();
		while (itr.hasNext()) {
			Double ele = itr.next();
			System.out.println(ele);
			if (ele == 3.1)
				list.add(3, 4.1);
		}

	}*/ 
	public static void main(String[] args) {
		// Fail-safe Iterator
		List<Double> list = new CopyOnWriteArrayList<Double>(); 
		Collections.addAll(list, 1.1, 2.1, 3.1, 4.1, 5.1);
		Iterator<Double> itr = list.iterator();
		while (itr.hasNext()) {
			Double ele = itr.next();
			System.out.println(ele);
			if (ele == 3.1)
				list.add(3, 9.1);
		}
		System.out.println();
		System.out.println("Updated list :: ");
		itr = list.iterator(); 
		while(itr.hasNext()) {
			Double ele = itr.next(); 
			System.out.println(ele);
		}

	}

}
