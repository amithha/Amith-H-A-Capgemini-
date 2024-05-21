package edu.atria.oops.collectionframework;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Demo {
	public static void main(String []args) {
		Set s =new LinkedHashSet(); //HashSet();
		s.add(5);
		s.add(75.5);
		s.add("Atria");
		s.add(true);
		s.add(true);
		
		System.out.println("the elements in the list"+s);
	}

}
