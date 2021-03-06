import java.io.*;
 
/**
 * Province class implements Serialable
 * to support mashalling
 *
 * @author http://lycog.com
 */
public class Province implements Serializable {
 
  private int password_;
  private String username_;
  private String onoma_;
  private String epwnimo_;
  private String tilefwno_;
  private String email_;
  private int codeType_;
  
  public Province() {
  }
 
  public Province(int password, String username, String onoma, String epwnimo, String tilefwno, String email, int codeType) {
	  password_ = password;
	  username_ = username;
	  onoma_ = onoma;
	  epwnimo_ = epwnimo;
	  tilefwno_ = tilefwno;
	  email_ = email;
	  codeType_ = codeType;
  }
 
  public int getPassword() {
    return password_;
  }
 
  public void setPassword(int password) {
	  password_ = password;
  }
 
  public String getUsername() {
    return username_;
  }
 
  public void setUsename(String username) {
	  username_ = username;
  }
 
  public String getOnoma() {
    return onoma_;
  }
 
  public void setOnoma(String onoma) {
    onoma_ = onoma;
  }
 

  public String getEpwnimo() {
    return epwnimo_;
  }
 
  public void setEpwnimo(String epwnimo) {
	  epwnimo_ = epwnimo;
  }
  

  public String getEmail() {
    return email_;
  }
 
  public void setEmail(String email) {
	  email_ = email;
  }

  public String getTilefwno() {
    return tilefwno_;
  }
 
  public void setTilefwno(String tilefwno) {
	  tilefwno_ = tilefwno;
  }
  
  public int getCodeType() {
	    return codeType_;
	  }

  public void setCodeType(int codeType) {
	  codeType_ = codeType;
  }


  public String toString() {
    return password_ + " - " + username_ + " - " + onoma_ + " - " + epwnimo_ + " - " + email_ + " - " + tilefwno_ + " - " + codeType_ ;
  }
}