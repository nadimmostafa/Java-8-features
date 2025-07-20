package org.nadim.collectionstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyStreamToMap2 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(101,"Kafi","COO",80000,"Nator"),
				new Employee(105,"Nadim","CEO",250000,"Chapai"),
				new Employee(104,"Mostafa","Developer",50000,"Dhaka"),
				new Employee(102,"Atik","Manager",70000,"Dhaka"),
				new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"),
				new Employee(103,"Asif","CTO",150000,"Rajshai")
			);

			// Map of employee ID to Employee object
			Map<Integer, Employee> employeeMap = employees.stream()
			    .collect(Collectors.toMap(e->e.empId, Function.identity()));

			// Group department to list of employee names
			Map<String, List<String>> deptToNames = employees.stream()
			    .collect(Collectors.groupingBy(
			        Employee::getCity,
			        Collectors.mapping(Employee::getName, Collectors.toList())
			    ));
			
			
			System.out.println(deptToNames);
			
	}
	
	

}
