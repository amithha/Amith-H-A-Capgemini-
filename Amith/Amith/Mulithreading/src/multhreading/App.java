package multhreading;

class Hello extends Thread{
		public void run() {
			for (int i=0;i<5;i++) {
				System.out.println("hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
				
			}
		}
	}
class Hii extends Thread{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("hii");
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Hello h1=new Hello();
				Hii h2=new Hii();
				h1.run();
				h2.run();
				h1.start();
				h2.start();
			
	}
}
