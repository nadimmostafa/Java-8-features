package org.nadim.predefine.functions;

import java.util.function.Function;

public class Program_04 {

	public static void main(String[] args) {
		
		
		//identity() return the same input argument
		Function<String,String> f = Function.identity();
		System.out.println(f.apply("Nadim"));
		// like 
		Function<String, String> ff = name -> name;
		System.out.println(ff.apply("Mostafa"));
		

	}

}
