package org.nadim.constructor.references;

public class Demo2 {

	public static void main(String[] args) {
		MyInterf i = Demo2::new;
		i.add(10, 20);
	}
	
	Demo2(int a, int b){
		System.out.println(a+b);
	}

}

interface MyInterf{
	void add(int a, int b);
}
