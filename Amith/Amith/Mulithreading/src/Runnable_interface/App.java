package Runnable_interface;
class Hii implements Runnable
{
	public void run() {
		for(int i=0;i<0;i++) {
			System.out.println("hello");
			System.out.println("world");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class Hello implements Runnable{
	public void run(){
		for(int i=0;i<3;i++) {
			System.out.println("world");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class App {
	public static void main(String[]args) {
		Hii obj=new Hii();
		Hello obj1=new Hello();
		Thread t1=new Thread();
		t1.start();
		
		Thread t2=new Thread();
		t2.start();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t2.getPriority());
		
	}
	
}
