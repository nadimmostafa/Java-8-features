package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyStreamMax {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		//write a program to print the employee name who is getting maximum salary
		Optional<Employee> optionalEmp=emplist.stream().max((t1,t2) ->(t1.getSalary()<t2.getSalary())?-1:(t1.getSalary()==t2.getSalary())?0:1);
		
		Employee e;
		if(optionalEmp.isPresent()) {
			e = optionalEmp.get();
			System.out.println(e.getName());
		}
		
		//or
		e =emplist.stream().max((t1,t2) ->(t1.getSalary()<t2.getSalary())?-1:(t1.getSalary()==t2.getSalary())?0:1).get();
		System.out.println(e.getName());
		
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(5);
		list.add(55);
		list.add(69);
		list.add(38);
		list.add(90);
		list.add(8);
		list.add(14);
		list.add(58);
		
		int max = list.stream().max((n1,n2)->n1.compareTo(n2)).get();
		System.out.println(max);
		
		//or
		
		int max2 = list.stream().max((n1,n2)->(n1>n2)?1:n1==n2?0:-1).get();
		System.out.println(max2);
		
		
		
		
		

	}

}
