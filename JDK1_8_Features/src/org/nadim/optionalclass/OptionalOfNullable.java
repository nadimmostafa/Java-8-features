package org.nadim.optionalclass;

import java.util.Optional;

public class OptionalOfNullable {

	public static void main(String[] args) {
		String [] arr = {"Nadim",null,"asif"};
		display(arr);
	}
	
	public static void display(String [] name) {
		for(String n:name) {
			Optional<String> nm = Optional.ofNullable(n);
			
			if(nm.isPresent()) {
				System.out.println(nm.get().toUpperCase());
			}
			
			//or
			nm.ifPresent(nn->System.out.println(nn.toLowerCase()));
		}
	}

}
