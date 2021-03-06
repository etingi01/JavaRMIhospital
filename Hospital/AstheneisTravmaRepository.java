import java.sql.*;
import java.util.*;
import java.sql.Date;
public class AstheneisTravmaRepository {

	

	  public static int save(AstheneisTravma p) throws ClassNotFoundException {
	    int iRet = -1;
	    try {
	      Connection con = DBManager.getConnection();
	      String SQL = "INSERT INTO astheneistrauma(codeTrauma, kodAsthenei, description, imerominiaTrauma) Values(?,?,?,?)";
	      PreparedStatement pstmt = con.prepareStatement(SQL);
	      pstmt.setInt(1, p.getCodeTravma());
	      pstmt.setInt(2, p.getKodAstheni());
	      pstmt.setString(3, p.getDesctription());
	      pstmt.setDate(4, p.getImerominiaTravma());

	      iRet = pstmt.executeUpdate();
	 
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	    return iRet;
	  }
	  public static AstheneisTravma findByCodeTravma(int criteria) throws ClassNotFoundException {
		    AstheneisTravma p = new AstheneisTravma();

		    try {
		      String QRY = "SELECT * FROM astheneistrauma WHERE codeTrauma=?";
		      Connection con = DBManager.getConnection();
		      PreparedStatement pstmt = con.prepareStatement(QRY);
		      pstmt.setInt(1, criteria);
		      ResultSet rs = pstmt.executeQuery();
		      while (rs.next()) {
		        p.setCodeTravma(rs.getInt("codeTrauma"));
		        p.setKodAstheni(rs.getInt("kodAsthenei"));
		        p.setDesctription(rs.getString("description"));
		        Date temp = Date.valueOf(rs.getString("imerominiaTrauma"));
		        p.setImerominiaTravma(temp);
		   }
		 
		      pstmt.close();
		    } catch (SQLException se) {
		      System.out.println(se);
		    }
		    return p;
		  }

	  public static ArrayList<AstheneisTravma> findByDate(Date criteria) throws ClassNotFoundException{
		    ArrayList<AstheneisTravma> arr = new ArrayList();
		    String datefind = criteria.toString();
		    try {
			      String QRY = "SELECT * FROM astheneistrauma WHERE imerominiaTrauma=?";
			      Connection con = DBManager.getConnection();
			      PreparedStatement pstmt = con.prepareStatement(QRY);
			      pstmt.setString(1,  datefind );
			      ResultSet rs = pstmt.executeQuery();
			      while (rs.next()) {  
					AstheneisTravma p = new AstheneisTravma();
			        p.setCodeTravma(rs.getInt("codeTrauma"));
			        p.setKodAstheni(rs.getInt("kodAsthenei"));
			        p.setDesctription(rs.getString("description"));
			        Date temp = Date.valueOf(rs.getString("imerominiaTrauma"));
			        p.setImerominiaTravma(temp);
			        arr.add(p);
			   }
		      pstmt.close();
	    } catch (SQLException se) {
	        System.out.println(se);
	      }
		    return arr;
	  }
	  
	  public static ArrayList<AstheneisTravma> findBykodAstheni(int criteria) throws ClassNotFoundException{
		    ArrayList<AstheneisTravma> arr = new ArrayList();
		    try {
			      String QRY = "SELECT * FROM astheneistrauma WHERE kodAsthenei=?";
			      Connection con = DBManager.getConnection();
			      PreparedStatement pstmt = con.prepareStatement(QRY);
			      pstmt.setInt(1, criteria);
			      ResultSet rs = pstmt.executeQuery();
			      while (rs.next()) {  
					AstheneisTravma p = new AstheneisTravma();
			        p.setCodeTravma(rs.getInt("codeTrauma"));
			        p.setKodAstheni(rs.getInt("kodAsthenei"));
			        p.setDesctription(rs.getString("description"));
			        Date temp = Date.valueOf(rs.getString("imerominiaTrauma"));
			        p.setImerominiaTravma(temp);
			        arr.add(p);
			   }
		      pstmt.close();
	    } catch (SQLException se) {
	        System.out.println(se);
	      }
		    return arr;
	  }
	  
}
