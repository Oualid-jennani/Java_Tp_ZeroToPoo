import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;;
public class Program {
	static void writer(String fille) {
		
		try {
			
		FileWriter w = new FileWriter(fille);
		w.write("helo walid jennani");
		w.close();
		
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	static void reader(String fille) {
		
		try {
			
		FileReader w = new FileReader(fille);
		int c;
	    while((c=w.read())!=-1) {
	    System.out.print((char)c);
	    }	
	    w.close();
	    
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	static Scanner reader =new Scanner(System.in);
	public static void main(String[] args) {
		
		int CH;
		String Namefille;
		
		System.out.println("tapez le nom de ficher");
        Namefille = reader.nextLine();
        //C:\Users\Walid Jennani\Desktop\walid.txt
		System.out.println("tapez 1 pour write ou tappez 2 pour read");
        CH = reader.nextInt();
        
        switch(CH) {
        case 1 : writer(Namefille);break;
        case 2 : reader(Namefille);break;
        default: System.out.println("votre choix invalid");
        }
	}

}
