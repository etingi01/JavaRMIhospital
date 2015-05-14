import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TherapeiesAstheneiesRepository {
	
	public static int save(TherapeiesAstheneies p) throws ClassNotFoundException {
	    int iRet = -1;
	    try {
	    	Connection con = DBManager.getConnection();
	    	String SQL = "INSERT INTO therapeiesastheneies(codeAstheneias, therapeiaCode, imerominiaTA) Values(?,?,?)";
	    	PreparedStatement pstmt = con.prepareStatement(SQL);
	    	pstmt.setInt(1, p.getCodeAstheneias());
	    	pstmt.setInt(2, p.getTherapeiaCode());
	    	pstmt.setDate(3, (Date) p.getImerominiaTA());

	    	iRet = pstmt.executeUpdate();
	 
	    	pstmt.close();
	    	
	    } catch (SQLException se) {
	   		System.out.println(se);
	    }
	    return iRet;
	    
	}
	 
	
	public static TherapeiesAstheneies findByTherapeiaAndAstheneia (int id, int id1) throws ClassNotFoundException {
		TherapeiesAstheneies  p = new TherapeiesAstheneies();
	  
		try {
			String QRY = "SELECT * FROM therapeiesastheneies WHERE codeAstheneias = ? AND therapeiaCode = ?";
			Connection con = DBManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(QRY);
			pstmt.setInt(1, id);
			pstmt.setInt(2, id1);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				p.setCodeAstheneias(rs.getInt("codeAstheneias"));
				p.setTherapeiaCode(rs.getInt("therapeiaCode"));
				p.setImerominiaTA(rs.getDate("imerominiaTA"));
			}
      
			pstmt.close();
    
		} catch (SQLException se) {
			System.out.println(se);
		}
			return p;
		
	}

	public static ArrayList<TherapeiesAstheneies> findByAstheneia (int id) throws ClassNotFoundException {
		TherapeiesAstheneies p = new TherapeiesAstheneies();
		ArrayList<TherapeiesAstheneies> astheneia = new ArrayList<TherapeiesAstheneies>();
		
		try {
			String QRY = "SELECT * FROM therapeiesastheneies WHERE codeAstheneias = ?";
			Connection con = DBManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(QRY);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				p.setCodeAstheneias(rs.getInt("codeAstheneias"));
				p.setTherapeiaCode(rs.getInt("therapeiaCode"));
				p.setImerominiaTA(rs.getDate("imerominiaTA"));
				astheneia.add(p);
			}
      
			pstmt.close();
    
		} catch (SQLException se) {
			System.out.println(se);
		}
			return astheneia;
	}
	
	
	public static ArrayList<TherapeiesAstheneies> findByTherapeia (int id) throws ClassNotFoundException {
		TherapeiesAstheneies p = new TherapeiesAstheneies();
		ArrayList<TherapeiesAstheneies> therapeia = new ArrayList<TherapeiesAstheneies>();
	  
		try {
			String QRY = "SELECT * FROM therapeiesastheneies WHERE therapeiaCode = ?";
			Connection con = DBManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(QRY);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				p.setCodeAstheneias(rs.getInt("codeAstheneias"));
				p.setTherapeiaCode(rs.getInt("therapeiaCode"));
				p.setImerominiaTA(rs.getDate("imerominiaTA"));
				therapeia.add(p);
			}
      
			pstmt.close();
    
		} catch (SQLException se) {
			System.out.println(se);
		}
			return therapeia;
	}
}



