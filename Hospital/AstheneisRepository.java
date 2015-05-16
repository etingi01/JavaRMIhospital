import java.sql.*;
import java.util.ArrayList;
 
/**
 * ProvinceRepository: data accessor
 * @author http://lycog.com
 */
public class AstheneisRepository {
 
  /*public static int save(Astheneis p) throws ClassNotFoundException {
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
  }*/
 
  public static int update(Astheneis p) throws ClassNotFoundException {
    int iRet = -1;
    try {
      Connection con = DBManager.getConnection();
      String SQL = "UPDATE astheneis SET onoma=?, epwnimo=? tilefwno=? diefthinsi=? email=? flag=? dead=? WHERE idAstheneis=?";
      PreparedStatement pstmt = con.prepareStatement(SQL);
      pstmt.setString(1, p.getOnoma());
      pstmt.setString(2, p.getEpwnimo());
      pstmt.setString(3, p.getTilefwno());
      pstmt.setString(4, p.getDiefthinsi());
      pstmt.setString(5, p.getEmail());
      pstmt.setInt(6, p.getFlag());
      pstmt.setInt(7, p.getDead());
      iRet = pstmt.executeUpdate();
 
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
 
    return iRet;
  }
 
 
  public static Astheneis findById(int id) throws ClassNotFoundException {
    Astheneis p = new Astheneis();

    try {
      String QRY = "SELECT * FROM astheneis WHERE idAstheneis=?";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setInt(1,id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        p.setIdAstheneis(rs.getInt("idAstheneis"));
        p.setOnoma(rs.getString("onoma"));
        p.setEpwnimo(rs.getString("epwnimo"));
        p.setTilefwno(rs.getString("tilefwno"));
        p.setDiefthinsi(rs.getString("diefthinsi"));
        p.setEmail(rs.getString("email"));
        p.setFlag(rs.getInt("flag"));
        p.setDead(rs.getInt("dead"));
   }
 
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    return p;
  }
  
  public static ArrayList<Astheneis> findByFlag(int id) throws ClassNotFoundException {
	  ArrayList<Astheneis> arr = new ArrayList();

	    try {
	      String QRY = "SELECT * FROM astheneis WHERE flag=?";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      pstmt.setInt(1, id );
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	  	    Astheneis p = new Astheneis();
	        p.setIdAstheneis(rs.getInt("idAstehneis"));
	        p.setOnoma(rs.getString("onoma"));
	        p.setTilefwno(rs.getString("tilefwno"));
	        p.setDiefthinsi(rs.getString("diefthinsi"));
	        p.setEmail(rs.getString("email"));
	        p.setFlag(rs.getInt("flag"));
	        p.setDead(rs.getInt("dead"));
	        arr.add(p);
	   }
	 
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	    return arr;
	  }
  
  public static ArrayList<Astheneis> findByDead(int id) throws ClassNotFoundException {
	  ArrayList<Astheneis> arr = new ArrayList();
  

	    try {
	      String QRY = "SELECT * FROM astheneis WHERE dead=?";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      pstmt.setInt(1,  id);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	    	  Astheneis p = new Astheneis();
	        p.setIdAstheneis(rs.getInt("idAstehneis"));
	        p.setOnoma(rs.getString("onoma"));
	        p.setTilefwno(rs.getString("tilefwno"));
	        p.setDiefthinsi(rs.getString("diefthinsi"));
	        p.setEmail(rs.getString("email"));
	        p.setFlag(rs.getInt("flag"));
	        p.setDead(rs.getInt("dead"));
	        arr.add(p);
	   }	 
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	    return arr;
	  }
  
  public static ArrayList<Astheneis> findAll() throws ClassNotFoundException {
	  ArrayList<Astheneis> arr = new ArrayList();
  

	    try {
	      String QRY = "SELECT * FROM astheneis";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	    	  Astheneis p = new Astheneis();
	        p.setIdAstheneis(rs.getInt("idAstehneis"));
	        p.setOnoma(rs.getString("onoma"));
	        p.setTilefwno(rs.getString("tilefwno"));
	        p.setDiefthinsi(rs.getString("diefthinsi"));
	        p.setEmail(rs.getString("email"));
	        p.setFlag(rs.getInt("flag"));
	        p.setDead(rs.getInt("dead"));
	        arr.add(p);
	   }	 
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	    return arr;
	  }
  
}