package org.nadim.fl.lambda;

public class FIWithAnonymousInnerClass {

	public static void main(String[] args) {
		/*Cars c = new Cars() {
			public void start() {
				System.out.println("Engine Start");
			}
		};
		c.start();
		*/
		
		new Cars() {
			public void start() {
				System.out.println("Engine Start");
			}
		}.start();
	}
}

@FunctionalInterface
interface Cars{
	void start();
}
