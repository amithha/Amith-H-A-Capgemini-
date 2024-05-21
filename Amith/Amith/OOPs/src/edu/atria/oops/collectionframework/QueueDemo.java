package edu.atria.oops.collectionframework;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> que = new LinkedList<>();
		que.add(4);
		que.add(3);
		que.offer(2);
		que.offer(1);
		
		System.out.println("Queue Content is:"+que);
		System.out.println("Queue content(using remove)"+que.remove());
		que.clear();
		
		 System.out.println("Queue Content is(using peek) is "+que.peek());
		System.out.println("Queue Content is(using poll)"+que.poll());
		System.out.println("Queue Content is:"+que);
	}

}
