package org.nadim.streams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyJoining {

	public static void main(String[] args) {
		List<Student> std = Arrays.asList(
				new Student(101,"Asif","male","CSE"),
				new Student(205,"Shuvo","male","English"),
				new Student(102,"Nadim","male","CSE"),
				new Student(301,"Golam","male","BBA"),
				new Student(209,"Sadia","female","BBA"),
				new Student(317,"Mehjabin","female","English"),
				new Student(265,"Hakim","male","CSE"),
				new Student(195,"Naim","male","EEE"),
				new Student(405,"Kafi","male","CSE")
		);
		
		String joinName= std.stream().map(s->s.getName()).collect(Collectors.joining(","));
		System.out.println(joinName);


	}

}
