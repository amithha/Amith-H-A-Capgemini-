package edu.atria.oops.firstpackage;

public class Executive {
	public static void main(String[]args) {
		Base b1=new Base();
		System.out.println(b1.varDefault);
		System.out.println(b1.varPublic);
		System.out.println(b1.varProtected);
		//private members are not visible outside the class
		//System.out.println(b1.varPrivate);
		
	}

}
