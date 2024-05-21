package atria.edu.exceptiponhandeling;

public class Throws {
	
	public void Demo()throws Exception{
		int a=5/0;
		System.out.println(a);
	}
	public void Slave() {
		try {
			Demo();
			
		}
		catch(Exception e)
		{System.out.println("divide by zero");
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws obj =new Throws();
		obj.Slave();
	}

}
