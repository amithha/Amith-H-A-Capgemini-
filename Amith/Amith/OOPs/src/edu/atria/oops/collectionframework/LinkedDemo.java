package edu.atria.oops.collectionframework;
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
}
class LinkedList
{
	Node head;
	Node tail;
	public void insert(int data)
	{
		Node n = new Node(data);
		n.next = null;
		
		if(head == null)
		{
			head = n;
			tail = n;
		}
		else
		{
			tail.next = n;
			tail = n;
		}
	}
	
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
public class LinkedDemo {

	public static void main(String[] args) {
	
		
		LinkedList l1 = new LinkedList();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.display();
	

	}

}
