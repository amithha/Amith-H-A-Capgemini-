package edu.atria.oops.classandobjectdemo;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details..");
		int id=sc.nextInt();
		String name=sc.next();
		float salary=sc.nextFloat();
		String dept=sc.next();
		
		Employee eOne=new Employee();
		System.out.println(eOne);
	}
	

}
