package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.List;

public class MyStreamSorted {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		
		// default natural sorting order by invoking sorted() method
		emplist.stream().sorted().forEach(System.out::println);
		//emplist.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		//our customize sorting order calling method sorted(Comparator<T>)
		//emplist.stream().sorted((e1,e2)->(e1.getSalary()<e2.getSalary())?-1:e1==e2?0:1).forEach(System.out::println);

		
		
	}

}
