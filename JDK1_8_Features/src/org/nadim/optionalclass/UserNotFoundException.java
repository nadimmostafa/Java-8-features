package org.nadim.optionalclass;

public class UserNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String name) {
		super(name);
	}

}
