package org.nadim.fl.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(15);
		al.add(8);
		al.add(65);
		al.add(55);
		al.add(95);
		al.add(-5);
		
		//Custom sorting order
		//descending to ascending order  
		Comparator<Integer> c = (i1,i2) -> (i1>i2)?-1:(i1<i2)?1:0;
		Collections.sort(al,c);
		System.out.println(al);
	}

}
