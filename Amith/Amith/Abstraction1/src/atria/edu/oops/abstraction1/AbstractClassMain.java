package atria.edu.oops.abstraction1;

public class AbstractClassMain {
	
	public static void main(String[]args) {
		//cannot instantiate abstract class
		//Shape s=new Shape(2.0f)
		
		Shape sOne=new Square(2.5f);//Dynamic binding
		sOne.Calculatearea();
		sOne.display();
		
		Shape sTwo=new Rectangle(3.2f,2.5f);//Dynamic binding
		sTwo.Calculatearea();
		sTwo.display();
		
	}

}
