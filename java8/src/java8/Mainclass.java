package java8;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*****************************************************
		Myrubamble userun = new Myrubamble();
		Thread t = new Thread(userun);
		t.start();
		Runnable userun2 = ()->{
			System.out.println("thread is working widh lambda");
		};
		Thread t1 = new Thread(userun2);
		t1.start();
		//*****************************************************
		Mywork MW = ()-> {
			System.out.println("print lambda");
		};
		MW.dowork();
		//*****************************************************
		Mywork2 MW2 = (X,CH)-> {
			System.out.println("print lambda2 : ==> "+X+"  ----  "+CH);
		};
		MW2.dowork2(4,'k');
		//*****************************************************
		user.Welcom();
		
		UserMaroc Mu = new UserMaroc();
		Mu.userinfo("walid", 22);
		Mu.printInfo();
		
		UserFrance Fu = new UserFrance();
		Fu.userinfo("walid", 24);
		Fu.printInfo();
	}

}
