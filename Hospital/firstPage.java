import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.*;
import java.util.*;
public class firstPage {
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
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		/*Connection conn = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", this.userName);
		connectionProps.put("password", this.password);

		conn = DriverManager.getConnection("jdbc:mysql://"
				+ this.serverName + ":" + this.portNumber + "/" + this.dbName,
				connectionProps);*/
		// create our mysql database connection
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/hospital";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "evtingiri", "99756303");
	       

		return conn;
	}
	public boolean executeUpdate(Connection conn, String command) throws SQLException {
	    Statement stmt = null;
	    try {
	        stmt = conn.createStatement();
	        stmt.executeUpdate(command); // This will throw a SQLException if it fails
	        return true;
	    } finally {

	    	// This will run whether we throw an exception or not
	        if (stmt != null) { stmt.close(); }
	    }
	}
	public void run() throws ClassNotFoundException {

		// Connect to MySQL
		Connection conn = null;
		try {
			conn = this.getConnection();
			System.out.println("Connected to database");
		} catch (SQLException e) {
			System.out.println("ERROR: Could snot connect to the database");
			e.printStackTrace();
			return;
		}
		// Select from ipalliloi
		try {
		
		    String query = "SELECT * FROM ipalliloi";
		    // create the java statement
		    Statement st = conn.createStatement();
		       
		      // execute the query, and get a java resultset
		    ResultSet rs = st.executeQuery(query);
		    while (rs.next())
		      {
		        String username = rs.getString("username");
		        String epwnimo = rs.getString("epwnimo");
		        // print the results
		        System.out.println(username + " " + epwnimo + " ");
		      }
		      st.close();
		    
			System.out.println("Created a table");
	    } catch (SQLException e) {
			System.out.println("ERROR: Could not create the table");
			e.printStackTrace();
			return;
		}
		
		return;
	}

	
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		firstPage app = new firstPage();
		app.run();

	}

}
