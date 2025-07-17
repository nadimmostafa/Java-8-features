package org.nadim.functional.interfaces;

@FunctionalInterface
public interface InterfaceWithDefaultMethod {
	void m();
	
	default void show() {
		System.out.println("I am default method from functional Interface");
	}
	
	static void getMessage() {
		System.out.println("i am static method from functional Interface");
	}
}

