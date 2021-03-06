import java.sql.*;
 
/**
 * DBManager: Singleton pattern
 *
 * @author http://lycog.com
 */
public final class DBManager {
 
	/** The name of the MySQL account to use (or empty for anonymous) */
	private final String userName = "evtingiri";

	/** The password for the MySQL account (or empty for anonymous) */
	private final String password = "99756303";

	/** The name of the computer running MySQL */
	private final String serverName = "localhost";

	/** The port of the MySQL server (default is 3306) */
	private final int portNumber = 3306;

	/** The name of the database we are testing with (this default is installed with MySQL) */
	private final String dbName = "hospital";
	
	/** The name of the table we are testing with */
	private final String tableName = "JDBC_TEST";
	
	/**
	 * Get a new database connection
	 * 
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		// create our mysql database connection
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/hospital";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "evtingiri", "99756303");
	      System.out.println("everything is under control, yeah");
	      return conn;
	}  
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection con= getConnection();
		
		
	}

}
