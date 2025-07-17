package org.nadim.method.references;

public class MyDemo {
	
	public static void m2() {
		System.out.println("Static Method Reference");
	}

	public static void main(String[] args) {
		Test t = MyDemo::m2;
		t.m();
	}

}

interface Test{
	void m();
}
