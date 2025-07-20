package org.nadim.optionalclass;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		Optional<String> name = display(null);
		
		if(name.isPresent()) {
			System.out.println(name.get());
		}

	}
	
	public static Optional<String> display(String name) {
		Optional<String> op = Optional.ofNullable(name);
		return op;
	}

}
