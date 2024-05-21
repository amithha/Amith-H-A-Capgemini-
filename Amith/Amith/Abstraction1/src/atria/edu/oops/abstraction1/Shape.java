package atria.edu.oops.abstraction1;

public abstract class Shape {
	static float area;
	//abstract method
	public abstract float Calculatearea();
	
	//non abstract method
	//public static final void display() {
		//System.out.println("Area of the shape"+area);
	public void display() {
		System.out.println("Area of the shape"+area);
	}

}
