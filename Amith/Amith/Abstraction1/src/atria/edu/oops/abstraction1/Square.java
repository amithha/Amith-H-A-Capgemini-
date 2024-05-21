package atria.edu.oops.abstraction1;

public class Square extends Shape {
	float side;
	
	
		
	public Square(float side) {
		super();
		this.side = side;
	}



	@Override
	public float Calculatearea() {
		
		// TODO Auto-generated method stub
		return area=side*side;
	}
		
	
	
}
