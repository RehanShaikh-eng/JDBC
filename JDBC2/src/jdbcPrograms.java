// importing java.sql
import java.sql.*;
public class jdbcPrograms {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb1";
		String user = "root";
		String password = "Motiur(54321";
		// Querry to be executed
		String querry = "select * from student";
		try
		{
			// Establishing the Connection
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Established");
			
			// Creating statement Using Connection
			Statement stmt = con.createStatement();
			
			// Executing the Querry
		ResultSet rs =	stmt.execute Querry(querry);
			System.out.println("Querry is Executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
}
