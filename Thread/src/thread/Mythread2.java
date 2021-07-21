 package thread;

public class Mythread2 extends Thread {
	public void run() {
		display();
		}
	synchronized static void display(){
		int x=0;
		while(x<10) {
			System.out.println(x);
			x++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
