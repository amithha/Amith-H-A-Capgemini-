package atria.edu.oops.statickeyword;

public class EmployeeStatic {
	private String name;
	private int id;
	//static variable common for all employees
	private static String companyName="IBM";

	public EmployeeStatic(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public static String getCompanyName() {
		return companyName;
	}

	@Override
	public String toString() {
		return "EmployeeStatic [name=" + name + ", id=" + id + "companyName"+companyName+"]";
	}
	

}
