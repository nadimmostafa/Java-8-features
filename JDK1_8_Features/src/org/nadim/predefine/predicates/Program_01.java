package org.nadim.predefine.predicates;

import java.util.function.Predicate;

//Program to display names starts with K by using Predicate

public class Program_01 {

	public static void main(String[] args) {
		String[] names = { "Sunny", "Kajol", "malika", "Katrina", "karina" };
		Predicate<String> p = name-> name.startsWith("K"); //capital case
		//Predicate<String> p2 = name-> name.startsWith("k"); // lower case
		Predicate<String> p2 = name-> name.charAt(0)=='k'; // lower case
		
		check(p.or(p2),names);
	}

	public static void check(Predicate<String> p, String[] names) {
		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
	}

}
