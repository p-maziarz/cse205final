//Friday, March 17th 2023 -- CSE 205 Final Project
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	public static void main (String[] args) {
		Connection c = null;
		Statement stat = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/",
					"postgres", "cheese99"); //Change password ASAP because others will see this code 
			System.out.println("Connected to the database.");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}
}
