package atria.edu.oops.Finalkeyword;

final class Finalclass{
	void show() {
		System.out.println("final class is inherited");
	}
}
//can't create child classes from final class, ex String,Wrapper classes,System
/*class FinalChildclass extends Finalclass(){
}*/
	


public class FinalClassDemo {
	public static void main(String[]args) {
		Finalclass fOne=new Finalclass();
		fOne.show();
		
	
	}
}
