package atria.edu.oops.Finalkeyword;

public class FinalVariable {
	//final instance varible must be initialized
	//final int x; 
	final int x=100;
	
	//Declare a static blank final variable
	final static int Y=20;
	
	//instance method
	void change() {
		x=30;
		Y=200;
		
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
	
	//Declare a static block to initialize the final and final static variable;
	static {
		Y=25;
		//x=100; Once initialized,it cannot be reassigned
		
	}
	

}
