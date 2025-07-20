package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {

	public static void main(String[] args) {
		String [] animals= {"cat", "dog", "elephant", "bee","Tiger","Lion","Deer"};
		List<String> words = new ArrayList<>(Arrays.asList(animals));
		
		Long total = words.stream().collect(Collectors.counting());	
		//System.out.println(total); //7
		
		//group the elements based on element length
		Map <Integer, List <String>> groupList = words.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(groupList); // {3=[cat, dog, bee], 4=[Lion, Deer], 5=[Tiger], 8=[elephant]}
		
		//group the elements and count based on length
		Map<Integer, Long> l = words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
		//System.out.println(l); //{3=3, 4=2, 5=1, 8=1}
		
		
	}

}
