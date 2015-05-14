import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class ConsultationRepository {
 
	 public static int save(Consultation p) throws ClassNotFoundException {
		 int iRet = -1;
		 try {
			 Connection con = DBManager.getConnection();
			 String SQL = "INSERT INTO consultation (kodPatient, doctorusername, imerominiaConsultation, ora, emfanistike) Values(?,?,?,?,?)"; 
		     PreparedStatement pstmt = con.prepareStatement(SQL);
		     pstmt.setInt(1, p.getKodPatient());
		     pstmt.setString(2, p.getDoctorusername());
		     pstmt.setDate(3, (Date) p.getImerominiaConsultation());
		     pstmt.setTime(4, (Time) p.getOra());
		     pstmt.setInt(5, p.getEmfanistike());
		
		     iRet = pstmt.executeUpdate();
		 
		     pstmt.close();
		     
		 } catch (SQLException se) {
		      System.out.println(se);      
		 }
		 
		    return iRet; 
	 }
 
  public static  ArrayList<Consultation> findByKodPatient (int id) throws ClassNotFoundException {
	  Consultation  p = new Consultation();
	  ArrayList<Consultation> patient = new ArrayList<Consultation>();
	  
    try {
      String QRY = "SELECT * FROM consultation WHERE kodPatient = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setInt(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        p.setIdConsultation(rs.getInt("idConsultation"));
        p.setKodPatient(rs.getInt("kodPatient"));
        p.setDoctorusername(rs.getString("doctorusername"));
        p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
        p.setOra(rs.getTime("ora"));
        p.setEmfanistike(rs.getInt("emfanistike"));

        
        patient.add(p);
   }
      
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    return patient;
  }

  
  
  public static ArrayList<Consultation> findByDoctorUsername (String username) throws ClassNotFoundException {
	  	Consultation p = new Consultation();
		ArrayList<Consultation> doctor = new ArrayList<Consultation>();
		  
	    try {
	      String QRY = "SELECT * FROM consultation WHERE doctorusername = ? ";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      pstmt.setString(1, username);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	    	  p.setIdConsultation(rs.getInt("idConsultation"));
	          p.setKodPatient(rs.getInt("kodPatient"));
	          p.setDoctorusername(rs.getString("doctorusername"));
	          p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
	          p.setOra(rs.getTime("ora"));
	          p.setEmfanistike(rs.getInt("emfanistike"));

	          doctor.add(p);

	      }
	      
	      pstmt.close();
	    } catch (SQLException se) {
	      System.out.println(se);
	    }
	    
	    return doctor;
	  }
  
  public static ArrayList<Consultation> findByImerominia (Date id) throws ClassNotFoundException {
	  Consultation  p = new Consultation();
	 ArrayList<Consultation> imerominia = new ArrayList<Consultation>();
	  
    try {
      String QRY = "SELECT * FROM consultation WHERE imerominiaConsultation = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setDate(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
    	  p.setIdConsultation(rs.getInt("idConsultation"));
          p.setKodPatient(rs.getInt("kodPatient"));
          p.setDoctorusername(rs.getString("doctorusername"));
          p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
          p.setOra(rs.getTime("ora"));
          p.setEmfanistike(rs.getInt("emfanistike"));
        imerominia.add(p);
   }
      
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    
    return imerominia;
  }
  
  public static ArrayList<Consultation> findByEmfanistike (int id) throws ClassNotFoundException {
	  Consultation  p = new Consultation();
	 ArrayList<Consultation> emfanistike = new ArrayList<Consultation>();
	  
    try {
      String QRY = "SELECT * FROM consultation WHERE emfanistike = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setInt(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
    	  p.setIdConsultation(rs.getInt("idConsultation"));
          p.setKodPatient(rs.getInt("kodPatient"));
          p.setDoctorusername(rs.getString("doctorusername"));
          p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
          p.setOra(rs.getTime("ora"));
          p.setEmfanistike(rs.getInt("emfanistike"));
        emfanistike.add(p);
   }
      
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    
    return emfanistike;
  }
}
