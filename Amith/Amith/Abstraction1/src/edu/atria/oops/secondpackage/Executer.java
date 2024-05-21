package edu.atria.oops.secondpackage;

import edu.atria.oops.firstpackage.Base;

public class Executer extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1=new Base();
		//Default method is not visible outside the package
		//System.out.println(b1.varDefault);

		
		//System.out.println(b1.getVarProtected());
		//another way
		//Protected members are accessible outside the package by extending the base class
		Executer ex=new Executer();
		System.out.println(ex.varProtected);
		
		//Public is accessible everywhere
		System.out.println(b1.varPublic);

	}
}
