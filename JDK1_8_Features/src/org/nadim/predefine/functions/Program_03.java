package org.nadim.predefine.functions;

//find the number of spaces

import java.util.function.Function;

public class Program_03 {

	public static void main(String[] args) {
		Function<String, Integer> f = s ->s.length()-s.replaceAll(" ", "").length();
		System.out.println(f.apply("Mostafa Software Ltd."));

	}

}
