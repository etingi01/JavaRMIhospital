

import java.sql.*;
import java.util.ArrayList;
 
public class IstorikoTherapeiasRepository {
 
	public static int save(IstorikoTherapeias p) throws ClassNotFoundException {
		int iRet = -1;
		try {
			Connection con = DBManager.getConnection();
			String SQL = "INSERT INTO istorikotherapeias(codeTherapeias, sintagi, days) Values(?,?,?)";
	
			PreparedStatement pstmt = con.prepareStatement(SQL);
			//pstmt.setInt(1, p.getIdIstorikoTherapeias());
			pstmt.setInt(1, p.getCodeTherapeias());
			pstmt.setString(2, p.getSintagi());
			pstmt.setInt(3, p.getDays());
			
			iRet = pstmt.executeUpdate();
			 
			pstmt.close();
		} catch (SQLException se) {
			System.out.println(se);
		}
			 
		return iRet;
	}
 
	public static ArrayList<IstorikoTherapeias> findByCodeTherapeias (int id) throws ClassNotFoundException {
		IstorikoTherapeias  p = new IstorikoTherapeias();
		ArrayList<IstorikoTherapeias> istoriko = new ArrayList<IstorikoTherapeias>();
	  
		try {
			String QRY = "SELECT * FROM istorikotherapeias WHERE codeTherapeias = ?";
			Connection con = DBManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(QRY);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				p.setIdIstorikoTherapeias(rs.getInt("idIstorikoTherapeias"));
				p.setCodeTherapeias(rs.getInt("codeTherapeias"));
				p.setSintagi(rs.getString("sintagi"));
				p.setDays(rs.getInt("days"));
       
				istoriko.add(p);
			}
 
		pstmt.close();
		
		} catch (SQLException se) {
			System.out.println(se);
		}
    
		return istoriko;
  }

}



