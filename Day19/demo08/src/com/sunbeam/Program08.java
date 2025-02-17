package com.sunbeam;

import java.lang.Thread.State;
import java.util.Scanner;

public class Program08 {
	public static void main(String[] args) throws Exception {
		class PrintTable extends Thread {
			private int num;
			public PrintTable(int num) {
				this.num = num;
			}
			@Override
			public void run() {
				try {
					for (int i = 1; i <= 10; i++) {
						System.out.printf("%d * %d = %d\n", num, i, num * i);
						Thread.sleep(2000);				
					}
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted...");
				}
			}
		}
		
		PrintTable th = new PrintTable(4);
		th.setPriority(10); // max priority = 10
		System.out.println("th state -- before start() -- " + th.getState()); // NEW
		th.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press enter: ");
		sc.nextLine();
		
		th.interrupt(); // if thread is in sleep(), it will be forcibly wake up i.e. interrupt
		
		State state = th.getState();
		System.out.println("th state: " + state); // RUNNABLE or TIMED_WAITING
		
		th.join();
		System.out.println("th state -- after run() -- " + th.getState()); // TERMINATED
		System.out.println("Bye!");
	}
}
