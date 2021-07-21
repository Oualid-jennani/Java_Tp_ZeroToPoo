package thradwjn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t = new Mythread();
		t.start();

		try {
			t.join();    
	     }catch(Exception e) {}
		
		System.out.println(t.total);
		
		
		Mythread2 t2 = new Mythread2();
		synchronized (t2) {
			t2.start();

			try {
				t2.wait();    
		     }catch(Exception e) {}
			
		
			System.out.println(t2.total);

			
		}


	}

}
