package org.nadim.predefine.predicates;

import java.util.function.Predicate;

public class IsEqualMethod {

	public static void main(String[] args) {
		Predicate<String> p = Predicate.isEqual("Nadim Mostafa");
		
		System.out.println(p.test("Nadim"));
		System.out.println(p.test("Nadim Mostafa"));

	}

}
