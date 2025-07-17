package org.nadim.predefine.predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class TestMethod {

	public static void main(String[] args) {
		
		//to check given number is greater then 10 or not
		Predicate<Integer> p = n-> n>10;
		System.out.println(p.test(25));
		
		Check<Integer> c = n->n>10;
		System.out.println(c.test(45));
		
		//to check given String length is greater than 5 or not 
		Predicate<String> pp= name->name.length()>5;
		System.out.println(pp.test("Nadim Mostafa"));
		System.out.println(pp.test("Nadim"));
		
		// to check given collection object is empty or not
		Predicate<Collection<Integer>> ppp = a->a.isEmpty();
		
		List<Integer> l = new ArrayList<>();
		System.out.println(ppp.test(l));
		l.add(10);
		System.out.println(ppp.test(l));
		
		

	}

}

class WithoutPredicate{
	
	public boolean test(Integer n) {
		if(n>10) {
			return true; 
		}else {
			return false;
		}
	}
}


interface Check<T>{
	boolean test(T t);
}

