package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.List;

public class MyStreamCount {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		long totalItem = emplist.stream().count();
		//System.out.println(totalItem);
		
		// Count how many employees name start with A or N
		long totalemp=emplist.stream().filter(e->e.getName().startsWith("A") || e.getName().startsWith("N")).count();
		System.out.println(totalemp);
	}

}
