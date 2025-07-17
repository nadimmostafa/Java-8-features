package org.nadim.fl.lambda;

public class MultipleInheritanceWithDefaultMeethod implements Left, Right{

	public void m() {
		//System.out.println("Hello");
		Left.super.m();
	}
	
	public static void main(String[] args) {
		new MultipleInheritanceWithDefaultMeethod().m();
	}
}

interface Left{
	default void m() {
		System.out.println("Left Default Method");
	}
}

interface Right{
	default void m() {
		System.out.println("Right Default Method");
	}
}
