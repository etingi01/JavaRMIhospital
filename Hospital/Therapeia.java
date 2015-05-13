import java.io.Serializable;
import java.io.Serializable;

public class Therapeia implements Serializable {
	
	
	private int idTherapeia_;
	private String onomaTherapeias_;

	public Therapeia() {
	}
	 
	public Therapeia(int idTherapeia, String onomaTherapeias) {
		idTherapeia_ = idTherapeia;
		onomaTherapeias_ = onomaTherapeias;
	}
	 
	public int getIdTherapeia() {
		return idTherapeia_;
	}
		 
	public void setIdTherapeia(int idTherapeia) {
		idTherapeia_ = idTherapeia;
	}
	  
	public String getOnomaTherapeias() {
		return onomaTherapeias_;
	}
		
	public void setOnomaTherapeias(String onomaTherapeias) {
		onomaTherapeias_ = onomaTherapeias;
	}

    public String toString() {
    	return idTherapeia_ + " - " + onomaTherapeias_;
    }	  
			  
}
