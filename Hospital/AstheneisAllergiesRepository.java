import java.sql.*;

public class AstheneisAllergiesRepository {
	public static int save( AstheneisAllergies p) throws ClassNotFoundException {
	    int iRet = -1;
	    try {
	      Connection con = DBManager.getConnection();
	      String SQL = "INSERT INTO astheneisallergies (kodikosPatient, kodikosTherapias) Values(?,?)";
	      PreparedStatement pstmt = con.prepareStatement(SQL);
	      pstmt.setInt(1, p.getKodikosPatient());
	      pstmt.setInt(2, p.getKodikosTherapeias());

	      iRet = pstmt.executeUpdate();
	 
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	 
	    return iRet;
	  }
	
	  public static AstheneisAllergies findByKodikosPatient(int id) throws ClassNotFoundException {
		  AstheneisAllergies p = new AstheneisAllergies();

		    try {
		      String QRY = "SELECT * FROM astheneisallergies WHERE kodikosPatient LIKE(?)";
		      Connection con = DBManager.getConnection();
		      PreparedStatement pstmt = con.prepareStatement(QRY);
		      pstmt.setString(1, "%" + id + "%");
		      ResultSet rs = pstmt.executeQuery();
		      while (rs.next()) {
		    	p.setKodikosPatient(rs.getInt("kodikosPatient"));
		        p.setKodikosTherapeias(rs.getInt("kodikosTherapias"));
		        
		   }
		 
		      pstmt.close();
		    } catch (SQLException se) {
		      System.out.println(se);
		    }
		    return p;
		  }

}