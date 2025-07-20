package org.nadim.streams.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyCollectorsGroupingBy {

	public static void main(String[] args) {
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

		// write a program to group student based on department
		Map<String, List<Student>> groupByDept = std.stream()
				.collect(Collectors.groupingBy(e -> e.getDept()));
		//groupByDept.forEach((k, v) -> System.out.println(k + " " + v));
		
		
		// write a program to group student based on department
		// and count the students per department
		Map<String, Long> groupByDept2 = std.stream()
				.collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()));
		//groupByDept2.forEach((k, v) -> System.out.println(k + " " + v));
		
		
		Map<Integer, List<String>> collect = std.stream().map(s->s.getDept()).collect(Collectors.groupingBy(e->e.length()));
		//System.out.println(collect);
		
		String [] animals= {"cat", "dog", "elephant", "bee","Tiger","Lion","Deer"};
		List<String> words = new ArrayList<>(Arrays.asList(animals));
		
		//group based on the word length
		Map<Integer, List<String>> groupByLength = words.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(groupByLength);
	}

}
