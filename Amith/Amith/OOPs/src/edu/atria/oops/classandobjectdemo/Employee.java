package edu.atria.oops.classandobjectdemo;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String dept;
	
	public Employee() {
		System.out.println("Default constructor is called");
		
		
	}
	public Employee(int id,String name,float salary,String dept) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	//getter and setter
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
}
