
import java.io.Serializable;
import java.io.Serializable;

public class PatientAstheneies implements Serializable {
	
	private int codeArrwstias_;
	private int codeAstheni_;
	

	public PatientAstheneies() {
	}
	 
	public PatientAstheneies(int codeArrwstias, int codeAstheni) {
		codeArrwstias_ = codeArrwstias;
		codeAstheni_ = codeAstheni;
	}
	 
	public int getCodeArrwstias() {
		return codeArrwstias_;
	}
		 
	public void setCodeArrwstias (int codeArrwstias) {
	  codeArrwstias_ = codeArrwstias;
	}
	  
	public int getCodeAstheni() {
		return codeAstheni_;  
	}
	
	public void setCodeAstheni(int codeAstheni) {
		codeAstheni_ = codeAstheni;
	}
	   
    public String toString() {
    	return codeArrwstias_ + " - " + codeAstheni_;
    }	  
			  
}
