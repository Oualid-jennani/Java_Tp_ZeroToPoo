package java8;

import java.util.*;
import java.util.function.Predicate;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Login> ListLogin = new ArrayList<Login>();
		ListLogin.add(new Login("walid","1234w"));
		ListLogin.add(new Login("karim","abc"));
		ListLogin.add(new Login("Alae","0000"));
		ListLogin.add(new Login("Anas","ssa123"));
		ListLogin.add(new Login("mohamed","280"));
		
		//*******************************************************************************
		System.out.println("****User foreach****");
		for (Login login : ListLogin) {
			System.out.println("Name: "+login.UserName+"  password :"+login.Password);
		}
		
		//*******************************************************************************
		System.out.println("\n\n****user iterator****");
		Iterator<Login> i=ListLogin.iterator();
		while(i.hasNext()) {
			Login loginfo=i.next();
			System.out.println("Name: "+loginfo.UserName+"  password :"+loginfo.Password);
		}
	
		//*******************************************************************************
		System.out.println("\n\n****user lambda****");
		ListLogin.forEach(User->{
			System.out.println("Name: "+User.UserName+"  password :"+User.Password);
		});
		
		//*******************************************************************************
		Predicate<Login> search=(p)->p.Weakpassword()==true;
		System.out.println("\n\n****user lambda****");
		ListLogin.forEach(User->{
			if(search.test(User)) System.out.println("Name: "+User.UserName+"  password :"+User.Password);
		});
	}

}
