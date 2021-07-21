package thradwjn;

public class Mythread extends Thread {
	int total;
@Override
public void run() {
	
	try {
		for(int i=0;i<100;i++) 
		total+=i;
	    
     }catch(Exception e) {}
	

}


}
