import java.io.Serializable;

public class comments implements Serializable {
	
	private int patient_;
	private String doctor_;
	private String comments_;
	
	 public comments() {
	  }
	 
	 public comments(int patient, String doctor, String comments) {
		 patient_=patient;
		 doctor_=doctor;
		 comments_=comments;
	  }
	 
	 public int getPatient(){
		 return patient_;
	 }
	 public void setPatient(int patient){
		 patient_ = patient;
	 }
	 
	 public String getDoctor(){
		 return doctor_;
	 }
	public void setDoctor(String doctor){
		doctor_=doctor;
	}
	public String getComments(){
		return comments_;
	}
	public void setCommets(String com){
		comments_=com;

	}

    public String toString() {
  	    return patient_ + " - " + doctor_ + " - " + comments_ ;
  	  }	  
	  
}

