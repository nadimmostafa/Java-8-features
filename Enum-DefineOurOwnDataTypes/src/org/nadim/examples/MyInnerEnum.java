package org.nadim.examples;

public class MyInnerEnum {

	enum Week {
		sat, sun, mon, tue, wed, thu, fri;
	}

	public static void main(String[] args) {
		Week w = Week.sun;
		System.out.println(w);
	}

}
