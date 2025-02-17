package com.sunbeam;

public class Program04 {
	private static void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// thread creation - method 1
			// step1: create a new class inherited from thread class and override its run() method.
			// step2: create object of that thread class and call its start() method.
		class MyThread extends Thread {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("  My: " + i);
					delay(1000);
				}				
			}
		}
		MyThread th1 = new MyThread();
		th1.start();
		// thread creation - method 2
			// step1: create a new class inherited from Runnable interface and implement its run() method.
			// step2: create object of Thread class with the object of above Runnable class and call thread's start() method
		class YourRunnable implements Runnable {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Your: " + i);
					delay(1000);
				}				
			}			
		}
		Thread th2 = new Thread(new YourRunnable());
		th2.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main: " + i);
			delay(1000);
		}
	}
}
