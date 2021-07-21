package java8;

import java.util.StringJoiner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Names= {"name1","name2","name3","name4"};
		StringJoiner js = new StringJoiner("|","{","}");
		for(String name:Names) {
			js.add(name);
		}
		System.out.println(js);
	}

}
