import java.io.*;
 
public class EidiIpallilwn implements Serializable {
 
  private int codeEidikotitas_;
  private String onomaEidikotitas_;
  private int clinicalStaff_;
  
  public EidiIpallilwn() {
  }
 
  public EidiIpallilwn(int codeEidikotitas, String onomaEidikotitas, int clinicalStaff) {
	  codeEidikotitas_ = codeEidikotitas;
	  onomaEidikotitas_ = onomaEidikotitas;
	  clinicalStaff_ = clinicalStaff;
  }
 
  public int getCodeEidikotitas() {
	  return codeEidikotitas_;
  }
 
  public void setCodeEidikotitas(int codeEidikotitas) {
	  codeEidikotitas_ = codeEidikotitas;
  }
 
  public String getOnomaEidikotitas() {
	  return onomaEidikotitas_;
  }
 
  public void setOnomaEidikotitas(String onomaEidikotitas) {
	  onomaEidikotitas_ = onomaEidikotitas;
  }
  
  public int getClinicalStaff() {
	  return clinicalStaff_;
  }
  
  public void setClinicalStaff(int clinicalStaff) {
	  clinicalStaff_ = clinicalStaff;
  }

  public String toString() {
    return codeEidikotitas_ + " - " + onomaEidikotitas_ + " - " + clinicalStaff_;
  }
}