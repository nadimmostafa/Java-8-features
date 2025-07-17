package org.nadim.fl.lambda;

public class FLFindMax {

	public static void main(String[] args) {
		
		Demo d = (a,b,c)->(a>b)?a:(b>c)?b:c;
		System.out.println(d.emni(10,20,50));

	}

}

@FunctionalInterface
interface Demo{
	int emni(int a, int b,int c);
}
