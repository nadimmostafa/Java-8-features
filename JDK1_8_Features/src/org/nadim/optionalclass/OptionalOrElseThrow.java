package org.nadim.optionalclass;

import java.util.Optional;

public class OptionalOrElseThrow {

	public static void main(String[] args) {
		String [] arr = {"Nadim",null,"asif"};
		display(arr);
	}
	
	public static void display(String [] name) {
		for(String n:name) {
			String data="";
			try {
			data =Optional.ofNullable(n).orElseThrow(()-> new UserNotFoundException("Not Found"));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(data);
		}
	}
}
