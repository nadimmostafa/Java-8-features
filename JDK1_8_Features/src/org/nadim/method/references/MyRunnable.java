package org.nadim.method.references;

public class MyRunnable {
	
	public void m() {
		for(int i=0; i<5;i++) {
			System.out.println("From Child Thread "+i);
		}
	}

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Runnable rr = r::m;
		
		Thread t = new Thread(rr);
		
		t.start();
		
		for(int i =0; i<3; i++) {
			System.out.println("Main Thread "+i);
		}

	}

}
