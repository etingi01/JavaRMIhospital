import java.io.Serializable;
import java.io.Serializable;

public class Risk implements Serializable {
	
	
	private int arrostos_;
	private String giatros_;
	private int risk_;

	  public Risk() {
	  }

	  public Risk(int arrostos, String giatros, int risk) {
		  arrostos_ = arrostos;
		  giatros_ = giatros;
		  risk_ = risk;
	  }
	 
	  public int getArrostos() {
		  return arrostos_;
	  }
		 
	  public void setArrostos (int arrostos) {
		  arrostos_ = arrostos;
	  }
	  
	  public String getGiatros() {
		  return giatros_;
	  }
		 
	  public void setGiatros(String giatros) {
		  giatros_ = giatros;
	  }

	  public int getRisk() {
		  return risk_;
	  }
		 
	  public void setRisk(int risk) {
		  risk_ = risk;
	  }
	  
	  public String toString() {
		  return arrostos_ + " - " + giatros_ + " - " + risk_;
      }	  
			  
}
