package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyStreamFilter {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		//beginner level for understanding 
		Stream<Employee> s = emplist.stream();
		Predicate<Employee> p = emp -> emp.getName().startsWith("A");
		Stream<Employee> ss = s.filter(p);
		
		// to print the information
		Consumer<Employee> c = e->System.out.println(e.getName()+ " from "+e.getCity());
		//ss.forEach(c);
		
		//advance level
		emplist.stream().filter(e->e.getName().startsWith("A")).forEach(emp->System.out.println(emp.getName()+" from "+emp.getCity()));;
		
		
	}

}
