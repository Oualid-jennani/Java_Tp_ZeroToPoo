package java8;

public class UserFrance implements user {
	String name;
	int age;

	@Override
	public void userinfo(String Name,int age) {
		this.name=Name;
		this.age=age;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getage() {
		// TODO Auto-generated method stub
		return age;
	}
}
