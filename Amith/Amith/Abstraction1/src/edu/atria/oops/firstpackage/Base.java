package edu.atria.oops.firstpackage;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	public int getVarProtected() {
		return varProtected;
	}



	void methodDefault() {
		System.out.println("default access for base class");
		System.out.println("default varibale"+varDefault);
		
	}

}
