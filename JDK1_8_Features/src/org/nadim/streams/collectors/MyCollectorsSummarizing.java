package org.nadim.streams.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.nadim.collectionstream.Employee;

public class MyCollectorsSummarizing {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		// Sum of the salary
		Double sumOfSalary = emplist.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		System.out.println(sumOfSalary);
		
		//average of the salary
		Double aveOfSalary = emplist.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
		System.out.println(aveOfSalary);
		
		
		//Filter the maximum salary
		Optional<Employee> max = emplist.stream()
			.collect(Collectors
				.maxBy((e1,e2)->e1.getSalary()>e2.getSalary()?1:e1.getSalary()==e2.getSalary()?0:-1));
		
		if(max.isPresent()) {
			System.out.println(max.get().getName()+" is getting maximum salary "+max.get().getSalary());
		}
		
		
		//Filter the minimum salary
		Employee min = emplist.stream()
			.collect(Collectors
				.minBy((e1,e2)->e1.getSalary()>e2.getSalary()?1:e1.getSalary()==e2.getSalary()?0:-1)).get();

	}

}
