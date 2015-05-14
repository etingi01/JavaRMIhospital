import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PatientAstheneiesRepository {
 

	public static int save(PatientAstheneies p) throws ClassNotFoundException {
		int iRet = -1;
		try {
			Connection con = DBManager.getConnection();
		    String SQL = "INSERT INTO patientastheneies(codeArrwstias, codeAstheni) Values(?,?)";
		    PreparedStatement pstmt = con.prepareStatement(SQL);
		    pstmt.setInt(1, p.getCodeArrwstias());
		    pstmt.setInt(2, p.getCodeAstheni());
		    
		    iRet = pstmt.executeUpdate();
		    
		    pstmt.close();
		    
		} catch (SQLException se) {
		      System.out.println(se);
		}
		return iRet;
	}
 
	public static  ArrayList<PatientAstheneies> findByCodeAstheni (int id) throws ClassNotFoundException {
		PatientAstheneies  p = new PatientAstheneies();
		ArrayList<PatientAstheneies> astheni = new ArrayList<PatientAstheneies>();
	  
		try {
			String QRY = "SELECT * FROM patientastheneies WHERE codeAstheni = ? ";
			Connection con = DBManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(QRY);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				p.setCodeArrwstias(rs.getInt("codeAstheni"));
				p.setCodeAstheni(rs.getInt("codeArrwstias"));
			  
				astheni.add(p);
			}
		  
			pstmt.close();
		  
		} catch (SQLException se) {
			System.out.println(se);
		}
    
	  return astheni;
	}

	public static  ArrayList<PatientAstheneies> findByCodeArrwstias (int id) throws ClassNotFoundException {
		PatientAstheneies  p = new PatientAstheneies();
		ArrayList<PatientAstheneies> arrwstia = new ArrayList<PatientAstheneies>();
	  
		try {
			String QRY = "SELECT * FROM patientastheneies WHERE codeArrwstias = ? ";
			Connection con = DBManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(QRY);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
      
			while (rs.next()) {
				p.setCodeArrwstias(rs.getInt("codeAstheni"));
				p.setCodeAstheni(rs.getInt("codeArrwstias"));
        
				arrwstia.add(p);
			}
      
			pstmt.close();
		} catch (SQLException se) {
			System.out.println(se);
		}
		
		return arrwstia;
	}
}



