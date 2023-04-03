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
			Class.forName("org.postgresql.Drive");
			c = DriverManger.getConnection(
					"jdbc:postgresql://localhost");
			
		} catch (Exception e) {
			
		}
	}
}
