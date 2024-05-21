package atria.edu.exceptiponhandeling;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=5/0;
			System.out.println(a);
//			try {
//			int arr[]= {2};
//			arr[10]=25;
//			}
//			catch(Exception e) {
//				System.out.println("array out of bound");
//			}
		
			throw new Exception();
			
		}
		catch(Exception e) {
			System.out.println("number divided by zero"+e);
//		}
//		finally {
//			System.out.println("Sushil is rich,but azhar is more richer");
//		}
	}

}
