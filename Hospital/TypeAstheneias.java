import java.io.Serializable;
import java.io.*;

public class TypeAstheneias implements Serializable {
 
  private int idTypeAstheneias_;
  private String Type_;
  
  public TypeAstheneias() {
  }
 
  public TypeAstheneias(int idTypeAstheneias, String Type) {
	  idTypeAstheneias_ = idTypeAstheneias;
	  Type_ = Type;
  }
 
  public int getIdTypeAstheneias() {
	  return idTypeAstheneias_;
  }
 
  public void setIdTypeAstheneias(int idTypeAstheneias) {
	  idTypeAstheneias_ = idTypeAstheneias;
  }
 
  public String getType() {
	  return Type_;
  }
 
  public void setType(String Type) {
	  Type_ = Type;
  }
 
  public String toString() {
	  return idTypeAstheneias_ + " - " + Type_;
  }
}