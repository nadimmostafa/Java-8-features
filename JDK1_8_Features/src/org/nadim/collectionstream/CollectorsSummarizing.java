package org.nadim.collectionstream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.nadim.streams.collectors.Test;

public class CollectorsSummarizing {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101,"Kafi","COO",80000,"Nator"));
		emplist.add(new Employee(105,"Nadim","CEO",250000,"Chapai"));
		emplist.add(new Employee(104,"Mostafa","Developer",50000,"Dhaka"));
		emplist.add(new Employee(102,"Atik","Manager",70000,"Dhaka"));
		emplist.add(new Employee(109,"Shuvo","Sr.Developer",65000,"Chapai"));
		emplist.add(new Employee(103,"Asif","CTO",150000,"Rajshai"));
		
		
		//Summarize the employee salary and display statistical information
		DoubleSummaryStatistics statisticReport = emplist.stream()
				.collect(Collectors.summarizingDouble(emp->emp.getSalary()));
		System.out.println("Total Employee "+ statisticReport.getCount());
		System.out.println("Total Employees Salary "+statisticReport.getSum());
		System.out.println("Maximum Salary to Pay is "+statisticReport.getMax());
		System.out.println("Minimum Salary to Pay is "+statisticReport.getMin());
		System.out.println("Ave0rage Salary is " +statisticReport.getAverage());
	}

}
