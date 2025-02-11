package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Program {
	
	/* 
	public static void main(String[] args) {
		//Deqeue as a Stack 
		Deque<Integer> q = new ArrayDeque<Integer>( );
		//Deque<Integer> q = new LinkedList<Integer>( );
		q.offerFirst(10);
		q.offerFirst(20);
		q.offerFirst(30);
		q.offerFirst(40);
		q.offerFirst(50);
		
		while(!q.isEmpty()) {
			Integer ele = q.pollFirst(); 
			System.out.println(ele);
		}

	}*/ 
	public static void main(String[] args) {
		//Deqeue as a Queue 
		Deque<Integer> q = new ArrayDeque<Integer>( ); 
		q.offerLast(10);
		q.offerLast(20);
		q.offerLast(30);
		q.offerLast(40);
		q.offerLast(50);
		
		while(!q.isEmpty()) {
			Integer ele = q.pollFirst(); 
			System.out.println(ele);
		}
	}

}
