import java.io.*;
import java.sql.Time;
import java.sql.Date;

public class Consultation implements Serializable {
 
  private int idConsultation_;
  private int kodPatient_;
  private String doctorusername_;
  private Date imerominiaConsultation_;
  private Time ora_;
  private int emfanistike_;
  
  public Consultation() {
  }
 
  public Consultation(int idConsultation, int kodPatient, String doctorusername, Date imerominiaConsultation, Time ora, int emfanistike) {
	  idConsultation_ = idConsultation;
	  kodPatient_ = kodPatient;
	  doctorusername_ = doctorusername;
	  imerominiaConsultation_ = imerominiaConsultation;
	  ora_= ora;
	  emfanistike_ = emfanistike;
  }
 
  public int getIdConsultation() {
	  return idConsultation_;
  }
 
  public void setIdConsultation(int idConsultation) {
	  idConsultation_ = idConsultation;
  }
 
  public int getKodPatient() {
	  return kodPatient_;
  }
 
  public void setKodPatient(int kodPatient) {
	  kodPatient_ = kodPatient;
  }

  public String getDoctorusername() {
	  return doctorusername_;
  }
 
  public void setDoctorusername(String doctorusername) {
	  doctorusername_ = doctorusername;
  }
  
  public Date getImerominiaConsultation() {
	  return imerominiaConsultation_;
  }
 
  public void setImerominiaConsultation(Date imerominiaConsultation) {
	  imerominiaConsultation_ = imerominiaConsultation;
  }
  
  public Time getOra() {
	  return ora_;
  }
 
  public void setOra(Time ora) {
	  ora_ = ora;
  }
  
  public int getEmfanistike() {
	  return emfanistike_;
  }
 
  public void setEmfanistike(int emfanistike) {
	  emfanistike_ = emfanistike;
  }
 
  public String toString() {
	  return idConsultation_ + " - " + kodPatient_ + " - " + doctorusername_ + " - " + imerominiaConsultation_ + " - " + ora_ + " - " + emfanistike_;
  }
}