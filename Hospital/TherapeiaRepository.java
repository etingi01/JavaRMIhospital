import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TherapeiaRepository {

	public static int save(Therapeia p) throws ClassNotFoundException {
	    int iRet = -1;
	    try {
	    	Connection con = DBManager.getConnection();
	    	String SQL = "INSERT INTO therapeia (idTherapeia, onomaTherapeias) Values(?,?)";
	    	PreparedStatement pstmt = con.prepareStatement(SQL);
	    	pstmt.setInt(1, p.getIdTherapeia());
	    	pstmt.setString(2, p.getOnomaTherapeias());

	    	iRet = pstmt.executeUpdate();
	    	pstmt.close();
	    } catch (SQLException se) {
	    	System.out.println(se);
	    }
	 
	    return iRet;
	  }
	 
	
	public static Therapeia findByTherapeia (int id) throws ClassNotFoundException {
		Therapeia  p = new Therapeia();
	    try {
	    	String QRY = "SELECT * FROM therapeia WHERE idTherapeia = ? ";
	    	Connection con = DBManager.getConnection();
	    	PreparedStatement pstmt = con.prepareStatement(QRY);
	    	pstmt.setInt(1, id);
	    	ResultSet rs = pstmt.executeQuery();
	    	while (rs.next()) {
	    		p.setIdTherapeia(rs.getInt("idTherapeia"));
	    		p.setOnomaTherapeias(rs.getString("onomaTherapeias"));
	    	}
	    	
	    	pstmt.close();

	    } catch (SQLException se) {
	    	System.out.println(se);
	    }
	    
	    return p;
	}

}



