package edu.atria.functional_interface;

import java.util.Scanner;

@FunctionalInterface
public interface isOdd {
	public boolean checkOdd(int a);
		
}
class LambdaWithParameter {

	public static void main(String []args) {
		isOdd odd= (a)->a%2!=0?true:false;
		System.out.println("enter a no");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(odd.checkOdd(n));
	}

}