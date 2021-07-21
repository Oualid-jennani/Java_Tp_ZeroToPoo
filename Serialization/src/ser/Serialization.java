package ser;
import java.io.*;
import java.util.*;
public class Serialization {
	
public static ArrayList<Employe> EMPlist = new ArrayList<Employe>();

static void Deserialization() {
	try {
		EMPlist=null;
		FileInputStream fileIn = new FileInputStream("employe.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
		EMPlist = (ArrayList<Employe>) in.readObject();
		in.close();
		fileIn.close();
		System.out.println("Deserialised");
		for(Employe tmp: EMPlist){
            System.out.println(tmp.tostoring());
        }
	}catch(Exception e) {
		e.printStackTrace();
	}
}
static void Serialization() {
	Employe emp1 = new Employe("walid", 21, "hay najd");
	EMPlist.add(emp1);
	Employe emp2 = new Employe("anas", 20, "hay najd");
	EMPlist.add(emp2);
	try {
		FileOutputStream fileOut =new FileOutputStream("employe.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(EMPlist);
		out.close();
		fileOut.close();
		System.out.println("serialised data is saved in employe.text file");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =new Scanner(System.in);
		int choix;		
		System.out.println("1 ==> serialize \n2 ==> deszrialize");
		choix = reader.nextInt();
		switch(choix) {
		case 1:Serialization();break;
		case 2:Deserialization();break;
		default :System.out.println("choix incorect");
		}

		
	}

}
