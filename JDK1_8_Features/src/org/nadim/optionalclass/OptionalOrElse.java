package org.nadim.optionalclass;

import java.util.Optional;

public class OptionalOrElse {

	public static void main(String[] args) {
		String [] arr = {"Nadim",null,"asif"};
		display(arr);
	}
	
	public static void display(String [] name) {
		for(String n:name) {
			String getName =Optional.ofNullable(n).orElse("Guest");
			System.out.println(getName);
		}
	}

}
