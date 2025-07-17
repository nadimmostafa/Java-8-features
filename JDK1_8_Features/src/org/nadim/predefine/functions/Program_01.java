package org.nadim.predefine.functions;

import java.util.Scanner;
import java.util.function.Function;

//Find length of the given string
public class Program_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		Function<String, Integer> f = s ->s.length();
		System.out.println(f.apply(name));

	}

}
