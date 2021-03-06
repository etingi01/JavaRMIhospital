import java.sql.*;
import java.util.*;

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
	
	  public static ArrayList<AstheneisAllergies> findByKodikosPatient(int id) throws ClassNotFoundException {
		  ArrayList<AstheneisAllergies> arr = new ArrayList();

		    try {
		      String QRY = "SELECT * FROM astheneisallergies WHERE kodikosPatient=?";
		      Connection con = DBManager.getConnection();
		      PreparedStatement pstmt = con.prepareStatement(QRY);
		      pstmt.setInt(1,  id );
		      ResultSet rs = pstmt.executeQuery();
		      while (rs.next()) {
		    	  AstheneisAllergies p = new AstheneisAllergies();
		    	p.setKodikosPatient(rs.getInt("kodikosPatient"));
		        p.setKodikosTherapeias(rs.getInt("kodikosTherapias"));
		        arr.add(p);
		   }
		 
		      pstmt.close();
		    } catch (SQLException se) {
		      System.out.println(se);
		    }
		    return arr;
		  }

}
