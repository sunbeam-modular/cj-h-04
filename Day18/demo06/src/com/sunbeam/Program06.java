package com.sunbeam;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class Program06 {
	/*
	public static void main(String[] args) {
		SortedMap<String, Charset> map = Charset.availableCharsets();
		System.out.println("Available Charsets: " + map.size());
		map.forEach((k,v) -> System.out.println(k + " -- " + v));
	}
	*/
	
	/*
	public static void main(String[] args) {
		try(FileReader rd = new FileReader("file1.txt")) {
			int ch;
			while((ch = rd.read()) != -1)
				System.out.print((char)ch);
		} // rd.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	public static void main(String[] args) {
		Charset charset = Charset.forName("UTF-16LE");
		try(FileReader rd = new FileReader("file2.txt", charset)) {
			int ch;
			while((ch = rd.read()) != -1)
				System.out.print((char)ch);
		} // rd.close();
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
