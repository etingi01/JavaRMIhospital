import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RiskRepository {
 

	 public static int save(Risk p) throws ClassNotFoundException {
		 int iRet = -1;
		 try {
			 Connection con = DBManager.getConnection();
			 String SQL = "INSERT INTO risk (arrostos, giatros, risk) Values(?,?,?)"; 
		     PreparedStatement pstmt = con.prepareStatement(SQL);
		     pstmt.setInt(1, p.getArrostos());
		     pstmt.setString(2, p.getGiatros());
		     pstmt.setInt(3, p.getRisk());
		
		     iRet = pstmt.executeUpdate();
		 
		     pstmt.close();
		     
		 } catch (SQLException se) {
		      System.out.println(se);      
		 }
		 
		    return iRet; 
	 }
 
  public static  ArrayList<Risk> findByCodeArrostos (int id) throws ClassNotFoundException {
	  Risk  p = new Risk();
	  ArrayList<Risk> astheni = new ArrayList<Risk>();
	  
    try {
      String QRY = "SELECT * FROM risk WHERE arrostos = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setInt(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        p.setArrostos(rs.getInt("arrostos"));
        p.setGiatros(rs.getString("giatros"));
        p.setRisk(rs.getInt("risk"));
        
        astheni.add(p);
     }
      
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    return astheni;
  }

  public static  ArrayList<Risk> findByCodeGiatros (String id) throws ClassNotFoundException {
	 Risk  p = new Risk();
	 ArrayList<Risk> arrwstia = new ArrayList<Risk>();
	  
    try {
      String QRY = "SELECT * FROM risk WHERE giatros = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setString(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        p.setArrostos(rs.getInt("arrostos"));
        p.setGiatros(rs.getString("giatros"));
        p.setRisk(rs.getInt("risk"));
       
        arrwstia.add(p);
   }
      
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    
    return arrwstia;
  }
  
  public static Risk findByArrostosAndGiatros (int id, String id1) throws ClassNotFoundException {
		 Risk p = new Risk();
		  
	    try {
	      String QRY = "SELECT * FROM risk WHERE arrostos = ? AND giatros = ?";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      pstmt.setInt(1, id);
	      pstmt.setString(2, id1);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	    	  p.setArrostos(rs.getInt("arrostos"));
	    	  p.setGiatros(rs.getString("giatros"));
	    	  p.setRisk(rs.getInt("risk"));
	       
	      }
	      
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	    
	    return p;
	  }
}



