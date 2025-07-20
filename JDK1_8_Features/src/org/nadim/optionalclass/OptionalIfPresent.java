package org.nadim.optionalclass;

import java.util.Optional;

public class OptionalIfPresent {

	public static void main(String[] args) {
		display("nadim");
	}
	
	public static void display(String name) {
		
		//old
		if(name!=null) {
			System.out.println(name);
		}
		
		//new 
		Optional.ofNullable(name).ifPresent(n->System.out.print(n));
	};

}
