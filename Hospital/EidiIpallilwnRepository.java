import java.sql.*;
import java.util.ArrayList;

public class EidiIpallilwnRepository {
 
 
  public static  ArrayList<EidiIpallilwn> findByCodeEidikotitas (int id) throws ClassNotFoundException {
	  ArrayList<EidiIpallilwn> ipalliloi = new ArrayList<EidiIpallilwn>();
	  
	  try {
		  String QRY = "SELECT * FROM eidiypallilwn WHERE codeEidikotitas = ?";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      pstmt.setInt(1, id);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	    	  EidiIpallilwn p = new EidiIpallilwn();
	    	  p.setCodeEidikotitas(rs.getInt("codeEidikotitas"));
	    	  p.setOnomaEidikotitas(rs.getString("onomaEidikotitas"));
	    	  p.setClinicalStaff(rs.getInt("clinicalStaff"));
	    	  ipalliloi.add(p);
	      }
 
	      pstmt.close();
    } catch (SQLException se) {
    	System.out.println(se);
    }
	  
	  return ipalliloi;
  }

}



