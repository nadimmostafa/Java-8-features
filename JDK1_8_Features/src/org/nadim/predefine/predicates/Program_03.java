package org.nadim.predefine.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class Program_03 {

	public static void main(String[] args) {
		
		Predicate<User> p = u -> u.username.equals("nadim") && u.password.equals("java");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User name: ");
		String username = s.nextLine();
		System.out.println("Enter password: ");
		String password = s.nextLine();
		
		User u = new User(username, password);
		
		if(p.test(u)) {
			System.out.println("User Authentication Successful.");
		}else {
			System.out.println("User Authentication Failed");
		}

	}

}

class User{
	String username;
	String password;
	
	public User(String username,String password) {
		this.username = username;
		this.password = password;
	}
}
