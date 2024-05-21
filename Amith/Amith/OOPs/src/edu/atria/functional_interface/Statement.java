package edu.atria.functional_interface;

@FunctionalInterface
public interface Statement {
	public String greet();
		
	//public int calculate();
	//Functional interface has only one abstract method
	
}
class LambdaWithoutParameter{
	public static void main(String [] args) {
		Statement s =()->{return "hello";};
		System.out.println(s.greet());
	}
}