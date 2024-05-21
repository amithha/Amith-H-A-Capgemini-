package atria.edu.oops.statickeyword;

public class Myclass {
	private int section;//non static instance variable
	private static int srNo;
	
	//static block
	static {
		System.out.println("----within static bolock----");
		srNo=1000;
	}
	//default constructor
	Myclass(){
		System.out.println("within default constructor ");
		srNo++;
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + ",srNo="+srNo+"]";
	}
	public static void display() {
		//connot access non static member(sice it is static method)
		//System.out.println(section);
		System.out.println(srNo);
	}
}
