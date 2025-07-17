package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.List;

//used to truncate a stream to a specific number of elements.
//if we want to process only first n number of elements out of the all elements of List 

public class MyStreamLimit {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		emplist.stream().limit(2).forEach(System.out::println);
		
		List<String> names = new ArrayList<>();
		names.add("Nadim");
		names.add("Asif");
		names.add("Mostafa");
		names.add("Nadim");
		names.add("Shuvo");
		names.add("Asif");
		names.add("Atik");
		
		// Display only first 3 elements
		//names.stream().limit(3).forEach(System.out::println);
		
		//sorted the elements based on length size and find max length of the given string elements
		names.stream().sorted((s,s2)->(s.length()<s2.length())?1:s.length()==s2.length()?0:-1).limit(1).forEach(System.out::println);

	}

}
