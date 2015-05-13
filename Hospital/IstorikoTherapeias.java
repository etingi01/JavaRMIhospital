
import java.io.*;
 
public class IstorikoTherapeias implements Serializable {
 
  private int idIstorikoTherapeias_;
  private int codeTherapeias_;
  private String sintagi_;
  private int days_;
  
  public IstorikoTherapeias() {
  }
 
  public IstorikoTherapeias(int idIstorikoTherapeias, int codeTherapeias, String sintagi, int days) {
	  idIstorikoTherapeias_ = idIstorikoTherapeias;
	  codeTherapeias_ = codeTherapeias;
	  sintagi_ = sintagi;
	  days_ = days;
  }
 
  public int getIdIstorikoTherapeias() {
	  return idIstorikoTherapeias_;
  }
 
  public void setIdIstorikoTherapeias(int idIstorikoTherapeias) {
	  idIstorikoTherapeias_ = idIstorikoTherapeias;
  }
 
  public int getCodeTherapeias() {
	  return codeTherapeias_;
  }
 
  public void setCodeTherapeias(int codeTherapeias) {
	  codeTherapeias_ = codeTherapeias;
  }
  
  public String getSintagi() {
	  return sintagi_;
  }
  
  public void setSintagi(String sintagi) {
	  sintagi_ = sintagi;
  }

  public int getDays() {
	  return days_;
  }
  
  public void setDays(int  days) {
	  days_ = days;
  }
 
  public String toString() {
	  return idIstorikoTherapeias_ + " - " + codeTherapeias_ + " - " + sintagi_ + " - " + days_;
  }
}