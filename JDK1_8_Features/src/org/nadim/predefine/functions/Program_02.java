package org.nadim.predefine.functions;

import java.util.function.Function;

public class Program_02 {

	public static void main(String[] args) {
		
		Function<String, String> f = s -> s.replaceAll(" ", "");
		System.out.println(f.apply("Nadim is Java Devloper"));

	}

}
