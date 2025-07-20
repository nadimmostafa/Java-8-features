package org.nadim.streams.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

import org.nadim.collectionstream.Employee;

public class MyCollectorsGroupingByAggregation {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		
		//sum of all employees salary per each city 
		Map<String, Double> sum = emplist.stream().collect(Collectors.groupingBy(e->e.getCity(),
				Collectors.summingDouble(e->e.getSalary())));
		//sum.forEach((c,s)->System.out.println("City "+c+" salary "+s));
		
		//Average salary from department
		Map<String,Double> ave= emplist.stream().collect(Collectors.groupingBy(e->e.getCity(),
				Collectors.averagingDouble(e->e.getSalary())));
		//System.out.println(ave);
		
		//Display who get max salary from department 
		Map<String, Optional<Employee>> max = emplist.stream().collect(Collectors.groupingBy(e->e.getCity(),
				Collectors.maxBy((e1,e2)->e1.getSalary()>e2.getSalary()?1:e1.getSalary()==e2.getSalary()?0:-1)));
		
		//max.forEach((k,v)->System.out.println("From "+ k+" "+v.get().getName()+" getting "+ v.get().getSalary()));
		
		//Display who get min salary from department 
		Map<String, Optional<Employee>> min = emplist.stream().collect(Collectors.groupingBy(e->e.getCity(),
						Collectors.minBy((e1,e2)->e1.getSalary()>e2.getSalary()?1:e1.getSalary()==e2.getSalary()?0:-1)));
				
		//min.forEach((k,v)->System.out.println("From "+ k+" "+v.get().getName()+" getting "+ v.get().getSalary()));	
		
	}

}
