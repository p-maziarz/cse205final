//Friday, March 17th 2023 -- CSE 205 Final Project
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Once this has been run, you'll need to use terminal to manipulate it 
public class Database {
	public static void main (String[] args) {
		Connection c = null;
		Statement stmt = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/",
					"postgres", "pgAdminMasterPass!"); //Created table in "postgres" database
			System.out.println("Connected to the database.");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		
		try {
			stmt = c.createStatement();
			String sql = "CREATE TABLE COMPANY " + 
			"(ID INT PRIMARY KEY NOT NULL," + 
			" NAME TEXT NOT NULL," + 
			"AGE INT NOT NULL, " + 
			" ADDRESS CHAR(50), " + 
			" SALARY REAL)";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
			System.out.println("Table has been created.");
			
		} catch (Exception e){
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}
}
