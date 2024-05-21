package edu.atria.oops.collectionframework;


import java.util.PriorityQueue;


public class PriorityQueueDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <Integer> que = new PriorityQueue<>();
		que.add(4);
		que.add(3);
		que.offer(2);
		que.offer(1);
		
		System.out.println("Queue Content is:"+que);
		System.out.println("Queue content(using remove)"+que.remove());

}
}