package com.sunbeam;

class MyClass {
	// the resource
	public MyClass() {
		System.out.println("Resource allocated.");
	}
	// ...
	// When GC destroys object, it will call finalize() before that.
	@Override
	protected void finalize() throws Throwable {
		// close the resource
		System.out.println("Resource closed.");
	}
	// good practice to write close() method and close resource manually to avoid resource leak
}
public class Program01 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj = null; // MyClass obj created above is eligible for GC
		//System.gc(); // requests GC.
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory: " + rt.totalMemory() / 1024.0 / 1024.0 + " MB");
		System.out.println("Max Memory: " + rt.maxMemory() / 1024.0 / 1024.0 + " MB");
		System.out.println("Free Memory: " + rt.freeMemory() / 1024.0 / 1024.0 + " MB");
		rt.gc(); // requests GC
		System.out.println("Bye!");
	}
}
