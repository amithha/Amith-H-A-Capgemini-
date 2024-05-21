package edu.atria.polymorphism;

public class OverloadingMain {

	public static void main(String[] args) {
		System.out.println("---------Method Overloading----------");
		System.out.println("Addtion of two interger"+MethodOverloading.add(10,20));
		System.out.println("Addition of two float values"+MethodOverloading.add(10.5f, 20.6f));
		System.out.println("Adding one integer and one float value"+MethodOverloading.add(5, 15.9f));
		System.out.println("Adding one float value and one integer "+MethodOverloading.add(7.9f, 15));
		System.out.println("Adding two string values"+MethodOverloading.add("Hello","Umar"));
		

	}

}
