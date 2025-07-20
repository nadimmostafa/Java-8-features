package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyStreamToMap {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "cherry");
		
		Map<String, Integer> fruitLengths = fruits.stream()
			    .collect(Collectors.toMap(
			        fruit -> fruit,          // Key mapper as Function<T,R>
			        fruit -> fruit.length()  // Value mapper as Function<T,R>
			    ));
		
		fruitLengths.forEach((k,v)->System.out.println("Key "+k+" and Value "+v));
		
		
		//or
		Map<String, Integer> fruitLens = fruits.stream()
			    .collect(Collectors.toMap(
			    		//its return the same input argument
			        Function.identity(), //Key mapper as Function<T,R>
			        String::length   // Value mapper as Function<T,R>
			    ));
		
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		emplist.add(new Employee(103,"Rashid","System Admin",40000,"Rajshai"));
		
		
		//If the mapped contain duplicate keys 
		//then the value mapping function(BinaryOperator <String> mergeFunction) is applied to each equal element, 
		//and the results are merged using the provided merging function. 
		Map<Integer, String> em = emplist.stream().collect(Collectors
				.toMap(e->e.empId, Employee::getName, (oldValue, newValue)->oldValue+newValue));
		
		System.out.println(em);
		
		
		// We can specify the Map implementation class
		Map<Integer, String> em2 = emplist.stream().collect(Collectors
				.toMap(e->e.empId, 
						Employee::getName, 
						(oldValue, newValue)->oldValue+newValue,
						TreeMap::new
					));
		
	}

}
