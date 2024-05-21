package edu.atria.oops.collectionframework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> number=new Vector<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		//calculate the size
		System.out.println("the size of vector "+number.size());
		
		//printing the value
		System.out.println("the numbers are"+number);
		for(Integer value:number) {
			System.out.println(value);
		}
		
		number.add(2,80);
		System.out.println(number);

	}

}
