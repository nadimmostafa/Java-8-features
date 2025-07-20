package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MyStreamToArray {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("cat", "dog", "elephant", "bee","Tiger","Lion","Deer");
		
		Object[] array = items.stream().toArray();
		//or
		String [] array2 = items.stream().toArray(String[]::new);
		//or
		String [] array3 = items.stream().toArray(size-> new String[size]);
		
		for(String i: array2) {
			System.out.println(i);
		}
		
		
		//primitive Stream
		int[] arr = IntStream.of(5,9,5,8,6).toArray();
		
		
		
	}

}
