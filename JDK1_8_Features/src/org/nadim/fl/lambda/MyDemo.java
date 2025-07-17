package org.nadim.fl.lambda;

public class MyDemo {
	
	int x = 888;
	
	public void m2() {
		
		Test t = new Test() {
			int x = 999;
			public void m() {
				System.out.println(this.x);
				System.out.println(MyDemo.this.x);
			}
		};
		
		t.m();
		
	}

	public static void main(String[] args) {
		MyDemo d = new MyDemo();
		d.m2(); 

	}

}

interface Test{
	void m();
}
