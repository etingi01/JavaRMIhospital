import java.io.Serializable;


public class AstheneisAllergies implements Serializable {
	private int kodikosPatient_;
	private int kodikosTherapias_;
	

	  public AstheneisAllergies() {
	  }

	  public AstheneisAllergies(int kodikosPatient, int kodikosTherapias) {
		  kodikosPatient_ = kodikosPatient;
		  kodikosTherapias_ =kodikosTherapias ;
	  }
	
	  public int getKodikosPatient(){
		  return kodikosPatient_;
	  }
	  public void setKodikosPatient(int kodikosPatient){
		  kodikosPatient_ = kodikosPatient;
	  }
	  
	  public int getKodikosTherapeias(){
		  return kodikosTherapias_;
		  
	  }
	  public void setKodikosTherapeias(int kodikosTherapias){
		  kodikosTherapias_ = kodikosTherapias;
	  }
	  
	  public String toString() {
  	    return kodikosPatient_ + " - " + kodikosTherapias_;
  	  }	
	  
}
