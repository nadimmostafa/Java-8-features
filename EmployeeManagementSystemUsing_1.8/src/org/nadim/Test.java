package org.nadim;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		toCreateEmp(list);
		Predicate<Employee> p = emp -> emp.designation.equalsIgnoreCase("Lead");
		displayEmpInfo(p,list);
		Predicate<Employee> p2 = emp -> emp.city.equalsIgnoreCase("rajshahi");
		displayEmpInfo(p2,list);
		
		//find out all Employees who are Lead and his city is Rajshahi
		displayEmpInfo(p.and(p2), list);
		//find out all Employees who are Lead or city is rajshahi
		displayEmpInfo(p.or(p2), list);
		//find out all Employees who are not Lead
		displayEmpInfo(p.negate(), list);
		

	}
	
	public static void toCreateEmp(ArrayList<Employee> list) {
		list.add(new Employee("Nadim","CEO",250000,"Chapai"));
		list.add(new Employee("Asif","Lead",50000,"Rajshahi"));
		list.add(new Employee("Golam","Sr.Developer",80000,"Chapai"));
		list.add(new Employee("Linkon","Jr.SQA",25000,"Dhaka"));
		list.add(new Employee("Rabbani","Lead",120000,"Chapai"));
		list.add(new Employee("Hakim","Developer",120000,"Chapai"));
		list.add(new Employee("Shuvo","Manager",120000,"Rajshahi"));
		list.add(new Employee("Ramim","Lead",120000,"Rajshahi"));
	}
	
	public static void displayEmpInfo(Predicate<Employee> p, ArrayList<Employee> lists) {
		
		for(Employee list:lists) {
			if(p.test(list)) {
				System.out.println(list);
			}
		}
		
		System.out.println("====================");
	}

}
