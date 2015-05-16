import java.sql.*;
import java.util.*;
 
/**
 * ProvinceRepository: data accessor
 * @author http://lycog.com
 */
public class ProvinceRepository {
 
  public static int save(Province p) throws ClassNotFoundException {
    int iRet = -1;
    try {
      Connection con = DBManager.getConnection();
      String SQL = "INSERT INTO ipalliloi(password, username, onoma, epwnimo, email, tilefwno, codeType) Values(?,?,?,?,?,?,?)";
      PreparedStatement pstmt = con.prepareStatement(SQL);
      pstmt.setInt(1, p.getPassword());
      pstmt.setString(2, p.getUsername());
      pstmt.setString(3, p.getOnoma());
      pstmt.setString(4, p.getEpwnimo());
      pstmt.setString(5, p.getEmail());
      pstmt.setString(6, p.getTilefwno());
      pstmt.setInt(7, p.getCodeType());

      iRet = pstmt.executeUpdate();
 
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
 
    return iRet;
  }
 
  /*public static int update(Province p) {
    int iRet = -1;
    try {
      Connection con = DBManager.getConnection();
      String SQL = "UPDATE Province SET ShortName=?, Name=? WHERE Id=?";
      PreparedStatement pstmt = con.prepareStatement(SQL);
      pstmt.setString(1, p.getShortName());
      pstmt.setString(2, p.getName());
      pstmt.setInt(3, p.getId());
 
      iRet = pstmt.executeUpdate();
 
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
 
    return iRet;
  }
 
  public static int delete(Province p) {
    int iRet = -1;
    try {
      Connection con = DBManager.getInstance().getConnection();
      String SQL = "DELETE FROM Province WHERE Id=?";
      PreparedStatement pstmt = con.prepareStatement(SQL);
      pstmt.setInt(1, p.getId());
 
      iRet = pstmt.executeUpdate();
 
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    return iRet;
  }
 
  public static void deleteAll() {
    Connection con = DBManager.getInstance().getConnection();
    try {
      con.setAutoCommit(false);
      String SQL = "DELETE FROM Province";
      PreparedStatement pstmt = con.prepareStatement(SQL);
 
      pstmt.executeUpdate();
      con.commit();
    } catch (SQLException se) {
      try {
        con.rollback();
      } catch (SQLException ise) {
      }
    } finally {
      try {
        con.setAutoCommit(true);
      } catch (SQLException fse) {
      }
    }
  }
 
  public static ArrayList findAll() {
    ArrayList arr = new ArrayList();
 
    try {
      String QRY = "SELECT * FROM Province ORDER BY Id";
      Connection con = DBManager.getInstance().getConnection();
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(QRY);
 
      while (rs.next()) {
        Province p = new Province();
        p.setId(rs.getInt("Id"));
        p.setShortName(rs.getString("ShortName"));
        p.setName(rs.getString("Name"));
        arr.add(p);
      }
 
      stmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    return arr;
  }*/
 
  public static Province findByUsername(String username) throws ClassNotFoundException {
    ArrayList arr = new ArrayList();
    Province p = new Province();
    try {
      String QRY = "SELECT * FROM ipalliloi WHERE username=?";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setString(1, username);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        p.setPassword(rs.getInt("password"));
        p.setEmail(rs.getString("email"));
        p.setEpwnimo(rs.getString("epwnimo"));
        p.setOnoma(rs.getString("onoma"));
        p.setTilefwno(rs.getString("tilefwno"));
        p.setCodeType(rs.getInt("codeType"));
        p.setUsename(rs.getString("username"));
   }
 
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    return p;
  }
  public static ArrayList<Province> findAll() throws ClassNotFoundException {
	    ArrayList<Province> arr = new ArrayList();

	    try {
	      String QRY = "SELECT * FROM ipalliloi";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	  	    Province p = new Province();
	        p.setPassword(rs.getInt("password"));
	        p.setEmail(rs.getString("email"));
	        p.setEpwnimo(rs.getString("epwnimo"));
	        p.setOnoma(rs.getString("onoma"));
	        p.setTilefwno(rs.getString("tilefwno"));
	        p.setCodeType(rs.getInt("codeType"));
	        p.setUsename(rs.getString("username"));
	        arr.add(p);
	   }
	 
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	    return arr;
	  }

}