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
		
		/*
		
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
		*/
		
		//Insert
		try {
			c.setAutoCommit(false); //Anytime changes need to made to the database, autocommit has to be disabled, or set to false, it allows us to make commitments to the database
			stmt = c.createStatement();
			
			String sql = "INSERT INTO COMPANY (" +
						"ID,NAME,AGE,ADDRESS,SALARY) " +
						"VALUES (1, 'Mike', 37, 'California', 20000.00);";
			stmt.executeLargeUpdate(sql);
					
			sql = "INSERT INTO COMPANY (" +
					"ID,NAME,AGE,ADDRESS,SALARY) " +
					"VALUES (2, 'Sara', 34, 'California', 21000.00);";
			stmt.executeLargeUpdate(sql);
		
			sql = "INSERT INTO COMPANY (" +
					"ID,NAME,AGE,ADDRESS,SALARY) " +
					"VALUES (3, 'Jake', 27, 'California', 30000.00);";
			stmt.executeLargeUpdate(sql);
			
			sql = "INSERT INTO COMPANY (" +
					"ID,NAME,AGE,ADDRESS,SALARY) " +
					"VALUES (4, 'Connor', 75, 'California', 100000.00);";
			stmt.executeLargeUpdate(sql);
			
			stmt.close();
			c.commit();
			c.close();
			System.out.println("Just added 5 new elements to the table.");
			
		} catch (Exception e){
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}
}
