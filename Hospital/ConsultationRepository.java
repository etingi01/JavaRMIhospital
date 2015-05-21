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
			 String SQL = "INSERT INTO consultation (kodPatient, doctorusername, imerominiaConsultation, ora) Values(?,?,?,?)"; 
		     PreparedStatement pstmt = con.prepareStatement(SQL);
		     pstmt.setInt(1, p.getKodPatient());
		     pstmt.setString(2, p.getDoctorusername());
		     pstmt.setDate(3, p.getImerominiaConsultation());
		     pstmt.setString(4, p.getOra());		
		     iRet = pstmt.executeUpdate();
		 
		     pstmt.close();
		     
		 } catch (SQLException se) {
		      System.out.println(se);      
		 }
		 
		    return iRet; 
	 }
		public static int update(Consultation p) throws ClassNotFoundException {
		    int iRet = -1;
		    try {
		      Connection con = DBManager.getConnection();
		      String SQL = "UPDATE consultation SET emfanistike=? WHERE idConsultation=?";
		      PreparedStatement pstmt = con.prepareStatement(SQL);
		      pstmt.setInt(1, p.getEmfanistike());
		      pstmt.setInt(2, p.getIdConsultation());
		      iRet = pstmt.executeUpdate();
		 
		      pstmt.close();
		    } catch (SQLException se) {
		      System.out.println(se);
		    }
		 
		    return iRet;
		  }
 
  public static  ArrayList<Consultation> findByKodPatient (int criteria) throws ClassNotFoundException, InterruptedException {
	  ArrayList<Consultation> patient = new ArrayList<Consultation>();
	  
    try {
      String QRY = "SELECT * FROM hospital.consultation WHERE kodPatient = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setInt(1, criteria);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
    	  Consultation  p = new Consultation();
    	  p.setIdConsultation(rs.getInt("idConsultation"));
    	  p.setKodPatient(rs.getInt("kodPatient"));
    	  p.setDoctorusername(rs.getString("doctorusername"));
    	  p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
    	  p.setOra(rs.getString("ora"));
    	  p.setEmfanistike(rs.getInt("emfanistike"));
    	  System.out.println("vrike");
    	  patient.add(p);
   }
      
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
      }
    return patient;
  }

  
  
  public static ArrayList<Consultation> findByDoctorUsername (String username) throws ClassNotFoundException {
		ArrayList<Consultation> doctor = new ArrayList<Consultation>();
		  
	    try {
	      String QRY = "SELECT * FROM consultation WHERE doctorusername = ? ";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      pstmt.setString(1, username);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	    	  Consultation p = new Consultation();
	    	  p.setIdConsultation(rs.getInt("idConsultation"));
	          p.setKodPatient(rs.getInt("kodPatient"));
	          p.setDoctorusername(rs.getString("doctorusername"));
	          p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
	          p.setOra(rs.getString("ora"));
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
	 ArrayList<Consultation> imerominia = new ArrayList<Consultation>();
	  
    try {
      String QRY = "SELECT * FROM consultation WHERE imerominiaConsultation = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setDate(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
    	  Consultation  p = new Consultation();
    	  p.setIdConsultation(rs.getInt("idConsultation"));
          p.setKodPatient(rs.getInt("kodPatient"));
          p.setDoctorusername(rs.getString("doctorusername"));
          p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
          p.setOra(rs.getString("ora"));
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
	 ArrayList<Consultation> emfanistike = new ArrayList<Consultation>();
	  
    try {
      String QRY = "SELECT * FROM consultation WHERE emfanistike = ? ";
      Connection con = DBManager.getConnection();
      PreparedStatement pstmt = con.prepareStatement(QRY);
      pstmt.setInt(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
    	  Consultation  p = new Consultation();
    	  p.setIdConsultation(rs.getInt("idConsultation"));
          p.setKodPatient(rs.getInt("kodPatient"));
          p.setDoctorusername(rs.getString("doctorusername"));
          p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
          p.setOra(rs.getString("ora"));
          p.setEmfanistike(rs.getInt("emfanistike"));
          emfanistike.add(p);
   }
      
      pstmt.close();
    } catch (SQLException se) {
      System.out.println(se);
    }
    
    return emfanistike;
  }
  public static ArrayList<Consultation> findAll() throws ClassNotFoundException {
		 ArrayList<Consultation> emfanistike = new ArrayList<Consultation>();
		  
	    try {
	      String QRY = "SELECT * FROM consultation";
	      Connection con = DBManager.getConnection();
	      PreparedStatement pstmt = con.prepareStatement(QRY);
	      ResultSet rs = pstmt.executeQuery();
	      while (rs.next()) {
	    	  Consultation  p = new Consultation();
	    	  p.setIdConsultation(rs.getInt("idConsultation"));
	          p.setKodPatient(rs.getInt("kodPatient"));
	          p.setDoctorusername(rs.getString("doctorusername"));
	          p.setImerominiaConsultation(rs.getDate("imerominiaConsultation"));
	          p.setOra(rs.getString("ora"));
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
