package edu.atria.oops.collectionframework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {
	public static void main(String []args) {
		Set<Integer> s=new TreeSet<>();
		
		TreeSet<Student> t=new TreeSet<Student>(); 
		t.add(new Student(101,"Rahul",98.88f));
		t.add(new Student(102,"Rithi",99.0f));
		t.add(new Student(102,"Ram",97.5f));
		t.add(new Student(102,"Ruchi",90.5f));
		t.add(new Student(102,"R",91.5f));
		
		System.out.println("the student details are"+t);
		
		
		
		
	
		s.add(5);
		s.add(10);
		s.add(15);
		//
		//s.add("atria");
		//s.add(15.4f);ClassCast exception
		//s.add(true);
		System.out.println("the elements in the tree set are"+s);
	}

}
