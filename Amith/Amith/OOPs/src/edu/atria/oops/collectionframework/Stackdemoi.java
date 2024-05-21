package edu.atria.oops.collectionframework;

import java.util.Stack;

public class Stackdemoi {
	public static void main(String[]args) {
		Stack<Integer> s=new Stack<Integer>();
		
		System.out.println("pushing the elements into the stack");
		s.push(6);
		s.push(1);
		s.push(7);
		s.push(5);
		
		System.out.println("the elements in stack are"+s);
		System.out.println("removing the last element"+s.pop());
		System.out.println("after removal:"+s);
		System.out.println("search an elemnent"+s.search(6));
		s.push(8);
		s.push(2);
		s.push(3);
		System.out.println("the elements in stack"+s);
		System.out.println("search an element"+s.search(1));
		System.out.println(s.peek());
		
		
	}

}
