import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SiggenisAstheniRepository {
 
	public static SiggenisAstheni findByKodikosArrostou (int id) throws ClassNotFoundException {
		SiggenisAstheni p = new SiggenisAstheni();
	  
		try {
	    	String QRY = "SELECT * FROM siggenisastheni WHERE kodikosArrostou = ? ";
	    	Connection con = DBManager.getConnection();
	    	PreparedStatement pstmt = con.prepareStatement(QRY);
	    	pstmt.setInt(1, id);
	    	ResultSet rs = pstmt.executeQuery();
	    	while (rs.next()) {
	    		p.setCodeSiggeni(rs.getInt("codeSIGGENI"));
	    		p.setKodikosArrostou(rs.getInt("kodikosArrostou"));
	    		p.setOnomaSiggeni(rs.getString("onomaSiggeni"));
	    		p.setTiliefonoSiggeni(rs.getInt("tiliefonoSiggeni"));
	    	}
	      
	    	pstmt.close();
	    	} catch (SQLException se) {
	    		System.out.println(se);
	    	}
	    	
	    return p;
	}

}
