package atria.edu.exceptiponhandeling;

public class InvalidAgeException extends Exception {
	
	//default constructor
//	public InvalidAgeException() {
//		super("invalid age");
//	}
	
	//parameterized constructor
	public InvalidAgeException(String message) {
		super(message);
		
	}
	

}
