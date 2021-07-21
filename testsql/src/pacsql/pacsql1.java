package pacsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import com.mysql.*;
public class pacsql1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect =null;
		Statement stat =null;
		PreparedStatement PRP =null;
		ResultSet resultset =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/myinfo","root","1996");
			
			stat = conect.createStatement();
			 
			//conect.prepareStatement("insert into sport(cin,nom,email) values(17,'chafik','ch.com')").executeUpdate();
			
			resultset = stat.executeQuery("select * from sport");
			while(resultset.next()) {
				int cin = resultset.getInt("cin");
				String nom = resultset.getString("nom");
				String email = resultset.getString("email");
				 System.out.println("cin: "+cin+"    "+"nom: "+nom+"   "+"email: "+email); 
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
