package atria.edu.oops.statickeyword;

public class EmployeeStaticMain {
	
	public static void main(String[]args) {
		System.out.println(EmployeeStatic.getCompanyName());
		EmployeeStatic e1=new EmployeeStatic("RAHUL",101);
		System.out.println(e1);
		EmployeeStatic eTwo=new EmployeeStatic("Amith",150);
		System.out.println(eTwo);
		
		
	}

}
