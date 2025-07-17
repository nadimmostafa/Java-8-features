package org.nadim.fl.lambda;

public class FIWithLambdaExpression {

	public static void main(String[] args) {
		Cars c = () -> System.out.println("Car Start with Lambda expresion");
		c.start();
	}

}
