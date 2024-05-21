package edu.atria.oops.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[]args) {
		//List list=new List();can't instantiate the list(since it is an instance)
		List list=new ArrayList();//List<String> list=new ArrayList();this is called type safety(this is used for restricting to a particular type)
		list.add(0,1);
		list.add(1,"Rahul");
		list.add(2,'M');
		list.add(3,98.9f);
		list.add(4,9036521208l);
		System.out.println(list);
		System.out.println("element in 1st index:"+list.get(1));
		//System.out.println("element in 7th index",+list.get);//exception
		System.out.println(list.contains("R"));
		System.out.println(list.size());
		list.add(5,"Rahul");
		System.out.println(list);
		list.add(6,null);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		
	}

}
