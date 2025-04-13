import java.sql.*;
public class example2 {

	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/pg1";
		String user = "root";
		String password = "Motiur(54321";
		
		String querry = "create table Student (ROLL int , NAME varchar(10))";
		//String querry1 = "INSERT INTO Student VALUES (1,'Rehan')";
		//String querry2 = "Update Student set name = 'Rohan' WHERE Roll = 2";
		//String querry3 = "Delete from Student Where Roll = 2";
			try
			{
			//Class.forName("com.mysql.cj.jdbc.Driver");
		
	//	System.out.println("Driver is Loaded");
		
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection is Established");
		
		Statement stmt = con.createStatement();
		stmt.execute(querry);
		System.out.println("Querry is Executed");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}