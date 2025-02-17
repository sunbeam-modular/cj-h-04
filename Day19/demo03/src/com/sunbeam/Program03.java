package com.sunbeam;

public class Program03 {
	/*
	public static void main(String[] args) throws Exception {
		System.out.println("Start!");
		Runtime rt = Runtime.getRuntime();
		Process process = rt.exec("notepad.exe");
		int status = process.waitFor();
		System.out.println("Child process exit status: " + status);
		System.out.println("Bye!");
	}
	*/
	
	public static void main(String[] args) throws Exception {
		System.out.println("Start!");
		Runtime rt = Runtime.getRuntime();
		String[] arguments = { "C:/Program Files/Mozilla Firefox/firefox.exe", "sunbeaminfo.in" };
		Process process = rt.exec(arguments);
		int status = process.waitFor();
		System.out.println("Child process exit status: " + status);
		System.out.println("Bye!");
	}
}
