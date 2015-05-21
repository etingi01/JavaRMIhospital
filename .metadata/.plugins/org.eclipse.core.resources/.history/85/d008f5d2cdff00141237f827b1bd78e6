import java.sql.*;
import java.util.*;
 
public class TypeAstheneiasRepostitory {
 
  public static TypeAstheneias findByIdTypeAstheneias (int id) throws ClassNotFoundException {
	  TypeAstheneias p = new TypeAstheneias();

    try {
      String QRY = "SELECT * FROM typeastheneias WHERE idTypeAstheneias = ?";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setInt(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        p.setIdTypeAstheneias(rs.getInt("idTypeAstheneias"));
        p.setType(rs.getString("Type"));
      }
 
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    return p;
  }
}