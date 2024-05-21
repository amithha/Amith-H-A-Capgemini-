package edu.atria.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {
		RBI bankOne = new SBI();
		System.out.println(bankOne.getRI());
		
		RBI bankTwo= new ICICI();
		System.out.println(bankTwo.getRI());

	}

}
		