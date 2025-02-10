package com.sunbeam;

import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		Stack<Integer>stk = new Stack<Integer>( );
		stk.push(10); 
		stk.push(20); 
		stk.push(30); 
		stk.push(40);
		stk.push(50);
		
		System.out.println("Topmost ele : "+stk.peek());
		while(!stk.isEmpty()) {
			Integer ele = stk.pop(); 
			System.out.println(ele);
		}
		

	}

}
