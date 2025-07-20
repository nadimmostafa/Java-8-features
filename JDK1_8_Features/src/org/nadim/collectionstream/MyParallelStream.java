package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.List;

/*
 * Parallel stream enables us to execute code in parallel on separate core processor.
 * when a stream is executes in parallel, the java runtime partitions the stream into multiple
 * sub-streams. Aggregate operations iterate over and process these sub-streams in parallel on
 * multiple core processes. then combine the results. 
 * 
 * we are getting the output that is not in ordered.
 * 
 */


public class MyParallelStream {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		//the output we are getting is not in ordered
		//emplist.parallelStream().map(e->e.getName()).forEach(System.out::println);
		
		//whenever we are using parallelStream, if we want to preserved insertion order
		//then we have to use forEachOrdered() method
		emplist.parallelStream().map(e->e.getName()).forEachOrdered(System.out::println);

	}

}
