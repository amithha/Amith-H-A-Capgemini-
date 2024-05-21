package edu.atria.oops.collectionframework;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo {
	public static void main(String[]args) {
		Deque <Integer> dq = new LinkedList();
		dq.add(4);
		dq.add(3);
		dq.offer(2);
		dq.offer(1);
		
		System.out.println("Queue Content is:"+dq);
		System.out.println("Queue content(using remove)"+dq.remove());
		
	}

}
