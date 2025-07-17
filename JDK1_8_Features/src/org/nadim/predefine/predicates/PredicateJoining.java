package org.nadim.predefine.predicates;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int [] num = {10,5,-8,85,96,87,22,9,3,51};
		
		//to check the given number is greater than 10
		Predicate<Integer> p = i->i>10;
		m(p,num);
		
		System.out.println("==========Print Even Number===========");
		//to check the even number from the given array
		Predicate<Integer> pp = i-> i%2==0;
		m(pp,num);
		
		System.out.println("=========== And Join ============");
		//print the numbers which are even and greater than 10 from the given array
		Predicate<Integer> p3 = p.and(pp);
		//m(p3,num);
		m(p.and(pp),num);
		
		System.out.println("========= x<10 =======");
		//print these numbers which are not greater than 10
		m(p.negate(),num);
		
		System.out.println("=========== or Join ============");
		//print the numbers which are even or greater than 10 from the given array
		//logic like =={ p.test(num) || pp.test(num) }
		m(p.or(pp),num);
		

	}
	
	public static void m(Predicate<Integer> p, int [] n) {
		
		for(int x:n) {
			if(p.test(x)) {
				System.out.println(x);
			}
		}
		
	}

}
