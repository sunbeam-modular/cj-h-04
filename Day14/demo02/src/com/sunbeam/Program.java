package com.sunbeam;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Program {
	
	/* 
	public static void main(String[] args) {
		//Queue<String> q = new ArrayDeque<String>( );
		Queue<String> q = new LinkedList<String>( );
		q.offer("One");
		q.offer("Two");
		q.offer("Three");
		q.offer("Four");
		q.offer("Five");
		
		System.out.println("First element : " + q.peek());
		System.out.println();
		while(!q.isEmpty()) {
			String str = q.poll(); 
			System.out.println(str);
		}
		System.out.println("Element removing from empty Queue : " + q.poll());

	}*/ 
	public static void main(String[] args) {
		Queue<String> q = new ArrayDeque<String>( ); // LinkedList(); 
		q.add("One"); 
		q.add("Two");
		q.add("Three");
		q.add("Four");
		q.add("Five");
		
		System.out.println("First element : " + q.element());
		while(!q.isEmpty()) {
			String ele = q.remove(); 
			System.out.println(ele);
		}
		//System.out.println("Element removing from empty Queue : " + q.remove());
	}

}
