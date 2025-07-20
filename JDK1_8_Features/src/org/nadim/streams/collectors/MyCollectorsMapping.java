package org.nadim.streams.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * mapping function to each element before they are collected.
 * The mapping() collectors are most useful when used in a multi-level reduction
 * such as downstream of a groupingBy() or partitioningBy().
 * 
 */


public class MyCollectorsMapping {

	public static void main(String[] args) {
		String [] animals= {"cat", "dog", "elephant", "bee","Tiger","Lion","Deer"};
		List<String> words = new ArrayList<>(Arrays.asList(animals));
		
		//only for testing
		List<Integer> mapping = words.stream().collect(Collectors
				.mapping(String::length, Collectors.toList()));
		//System.out.println(mapping);
		
		
		List<Student> std = Arrays.asList(
				new Student(101, "Asif", "male", "CSE"),
				new Student(205, "Shuvo", "male", "English"),
				new Student(102, "Nadim", "male", "CSE"),
				new Student(301, "Golam", "male", "BBA"),
				new Student(209, "Sadia", "female", "BBA"),
				new Student(317, "Mehjabin", "female", "English"),
				new Student(265, "Hakim", "male", "CSE"),
				new Student(195, "Naim", "male", "EEE"),
				new Student(405, "Kafi", "male", "CSE")

		);
		
		// get all student name by grouping based on dept
		Map<String,List<String>> groupByDept = std.stream()
				.collect(Collectors.groupingBy(e->e.getDept(),
				Collectors.mapping(e->e.getName(), Collectors.toList())));
		
		//groupByDept.forEach((k,v)->System.out.println(k+" "+v));

	}

}
