package org.nadim.fl.lambda;

public class FIWithoutLambdaExpression {

	public static void main(String[] args) {
		Car c = new Engine();
		c.start();
	}

}

@FunctionalInterface
interface Car {
	void start();
}

class Engine implements Car {
	public void start() {
		System.out.println("Car Engine Start");
	}
}
