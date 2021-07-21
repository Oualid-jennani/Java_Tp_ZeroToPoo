package ser;
import java.io.*;
public class Employe implements Serializable {
private String name;
private int Age;
private String email;

public Employe(String name , int Age , String email) {
	this.name=name;
	this.Age=Age;
	this.email=email;
}
public String tostoring() {
	return this.name +"   "+this.Age+"   "+this.email ;
}
 
}
