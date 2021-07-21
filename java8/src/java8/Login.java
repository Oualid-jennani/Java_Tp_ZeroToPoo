package java8;

public class Login {
	String UserName;
	String Password;
	public Login(String UserName,String Password) {
		this.UserName=UserName;
		this.Password=Password;
	}
	
	public boolean Weakpassword(){
		if(Password.length()<4)
			return true;
		else
			return false;
	}

}
