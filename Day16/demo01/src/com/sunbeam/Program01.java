package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program01 {
	/*
	public static void main(String[] args) {
		Double arr[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };
		Stream<Double> strm = Arrays.stream(arr);
		strm
			.skip(2)
			.limit(4)
			.forEach(e -> System.out.println(e)); // 3.3, 4.4, 5.5, 6.6
	}
	*/
		
	/*
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A sequence of elements supporting sequential and parallel aggregate operations.");
		list.add("In addition to Stream, which is a stream of object references, there are primitive specializations for IntStream.");
		list.add("To perform a computation, stream operations are composed into a stream pipeline.");
		
		Stream<String> strm = list.stream();
		strm
			.map(line -> line.toLowerCase())
			.flatMap(line -> Arrays.stream(line.split("[ ,\\.]"))) // needs a lambda expr: input is one element, and output is stream of elements.
			.filter(word -> !word.isEmpty())
			.distinct()
			.forEach(word -> System.out.println(word));
	}
	*/
	/*
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		Collections.addAll(set, 1, 2, 3, 4, 5, 6);
		
		Stream<Integer> strm = set.stream();
		//strm.forEach(e -> System.out.println(e));
		
		//Integer res = strm.reduce(0, (a,i)->a + i);
		Integer res = strm.reduce(0, (a,i)->{
			System.out.printf("a=%d + i=%d\n", a, i);
			return a + i;
		});
		System.out.println("Sum: " + res);
	}
	*/
	/*
	public static void main(String[] args) {
		int num = 5;
		Stream<Integer> strm = Stream.iterate(1, i->i+1);
		strm
			.limit(10)
			.map(i -> i * num)
			.forEach(e -> System.out.println(e));
	}
	*/
	/*
	public static void main(String[] args) {
		Random r = new Random();
		//Math.random(); // generates random number from 0.0 to 1.0
		//r.nextDouble(); // generates random number from 0.0 to 1.0
		//r.nextInt(100); // generates random number from 0 to 100
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100));
		strm
			.distinct()
			.limit(20)
			.forEach(e -> System.out.println(e));
	}
	*/
	/*
	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100));
		List<Integer> list = strm
			.distinct()
			.limit(10)
			.collect(Collectors.toList());
		//Collectors.toList() returns a Collector object that can collect stream elements into a List.
		System.out.println(list.toString());
	}
	*/
	/*
	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100));
		Set<Integer> set = strm
			.distinct()
			.limit(10)
			.collect(Collectors.toSet());
		//Collectors.toSet() returns a Collector object that can collect stream elements into a Set.
		System.out.println(set.toString());
	}
	*/
	/*
	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100));
		Set<Integer> set = strm
			.distinct()
			.limit(10)
			.collect(Collectors.toSet());
		//Collectors.toSet() returns a Collector object that can collect stream elements into a Set.
		System.out.println(set.toString());
	}
	*/
	/*
	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100));
		Map<Integer,String> map = strm
			.distinct()
			.limit(10)
			.collect(Collectors.toMap(i->i, i-> (i % 2==0 ? "Even" : "Odd") ));
		//Collectors.toMap() returns a Collector object that can collect stream elements into a Map.
		//	keyMapper is lambda expr that calculates the key, 
		//	valueMapper is lambda expr that calculates the value.
		System.out.println(map.toString());
		
		map.forEach((k,v) -> System.out.println(k + " --> " + v));
	}
	*/
	
	/*
	// primitive streams are more efficient -- because no boxing/unboxing done for each arithmetic
	public static void main(String[] args) {
		Stream<Integer> strm1 = Stream.iterate(1, i->i+1).limit(10);
			// strm1 -- Stream of Integer (wrapper class)
		//Stream<int> strm2 = Stream.iterate(1, i->i+1).limit(10); 
			// compiler error: generics do not allow primitive types
		IntStream strm3 = IntStream.iterate(1, i->i+1).limit(10);
			// strm3 -- Stream of int (primitive)
		int res3 = strm3.reduce(0, (a,i)->a + i);
		System.out.println("Sum of Ints: " + res3);
		
		IntStream strm4 = IntStream.rangeClosed(1, 10); // 1 to 10
		System.out.println("Average of Ints: " + strm4.average());
		
		IntStream strm5 = IntStream.range(1, 10); // 1 to 9
		IntSummaryStatistics stats = strm5.summaryStatistics();
		System.out.println("Descriptive Statistics: " + stats.toString());
	}
	*/
	
	public static void main(String[] args) {
		Stream<Integer> strm1 = Stream.of(1, 2, 3, 4, 5); // stream of 5 elements
		Optional<Integer> maxInt = strm1.max((x,y) -> x - y);
		
		if(maxInt.isPresent()) // true
			System.out.println("max int = " + maxInt.get()); // 5
		
		System.out.println("max int = " + maxInt.orElse(0)); // 5
		
		maxInt.ifPresent(i -> System.out.println("max int = " + i)); // 5

		Stream<Integer> strm2 = Stream.empty(); // empty stream
		maxInt = strm2.max((x,y) -> x - y);
		
		if(maxInt.isPresent()) // false
			System.out.println("max int = " + maxInt.get()); // not execute
		
		System.out.println("max int = " + maxInt.orElse(0)); // 0
		
		maxInt.ifPresent(i -> System.out.println("max int = " + i)); // lambda expr not execute
	}
}


































