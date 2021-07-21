package java8;

public interface user {
	public void userinfo(String Name,int age);
	
	public String getname();
	public int getage();
	 default public void printInfo() {
		System.out.println("Helo :"+getname()+"   your age is:"+getage());
		
	}
	static public void Welcom() {
		System.out.println("Welcom");
		
	}
	
}
