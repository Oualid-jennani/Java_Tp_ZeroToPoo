
package hachmap;
import java.util.*;
public class recherch {
	static Scanner reader =new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<String> Lball = new ArrayList<String>();
		Lball.add("fot ball");
		Lball.add("ball hand");
		Lball.add("sot ball");
		
		ArrayList<String> Lsport = new ArrayList<String>();
		Lsport.add("tenis sport");
		Lsport.add("sport hein");
		Lsport.add("bien sport");
		
		ArrayList<String> Loujda = new ArrayList<String>();
		Loujda.add("ecole oujda");
		Loujda.add("oujda city");
		Loujda.add("oujda maroc");
		
		HashMap<String, ArrayList<String>> s = new HashMap<String, ArrayList<String>>();
		s.put("ball", Lball);
		s.put("spor", Lsport);
		s.put("ouj", Loujda);
		
		String ch ;
		
		ch = reader.nextLine();
		
		 System.out.println(s.get(ch));
		
		

	}

}
