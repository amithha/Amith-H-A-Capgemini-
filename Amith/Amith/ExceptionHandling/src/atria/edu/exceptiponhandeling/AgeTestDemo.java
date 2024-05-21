package atria.edu.exceptiponhandeling;

import java.util.Scanner;

public class AgeTestDemo {
	static void validate(int age) throws InvalidAgeException {//no need for creating the object if u are using static variable
		if(age<18) {
			throw new InvalidAgeException("invalid age,you are not eligible to vote");
			
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		try {
			validate(age);
		}
		catch(InvalidAgeException i) {
			System.out.println("exception caught..., "+ i.getMessage());
		}
		sc.close();
	}

}
