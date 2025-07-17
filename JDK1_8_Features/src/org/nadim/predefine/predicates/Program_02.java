package org.nadim.predefine.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

//Predicate Example to Remove null values and Empty String from the given List

public class Program_02 {

	public static void main(String[] args) {
		
		String [] names = {"Nadim", "","Asif",null,"","Kafi","Golam",null,"Asraful"};
		
		Predicate<String> p = n -> n!=null && n.length()!=0;
		ArrayList<String> al = new ArrayList<>();
		
		for(String name: names) {
			if(p.test(name)) {
				al.add(name);
			}
		}
		
		System.out.println(al);

	}

}
