
import java.io.Serializable;
import java.io.Serializable;

public class Warnings implements Serializable {
	
	private String iddoctor_;
	private int kodArrostou_;
	private  int therapeia_;
	private int codeConsultation_;
	

	  public Warnings() {
	  }

	  public Warnings(String iddoctor, int kodArrostou, int therapeia, int codeConsultation) {
		  iddoctor_= iddoctor;
		  kodArrostou_ = kodArrostou;
		  therapeia_= therapeia;
		  codeConsultation_=codeConsultation;		  
	  }
	 
	  public String getIddoctor() {
		    return iddoctor_;
		  }
		 
	  public void setIddoctor(String iddoctor  ) {
		  iddoctor_ = iddoctor;
		  }
	  public int getKodArrostou() {
	 		    return kodArrostou_ ;
			  }
			 
		public void setKodArrostou(int kodArrostou) {
			kodArrostou_  = kodArrostou;
			  }
			  
		public int getTherapeia_() {
				    return therapeia_;
				  }
				 
		public void setTherapeia (int therapeia) {
			therapeia_ = therapeia;
				  }	  
		 
	  
		public int getCodeConsultation() {
		    return 	codeConsultation_;
		  }
		public void setCodeConsultation (int codeConsultation) {
			codeConsultation_ = codeConsultation;
				  }	  
		 
		
			  
              public String toString() {
            	    return iddoctor_ + " - " +  kodArrostou_  + " - " + therapeia_ + " - " + codeConsultation_  ;
            	  }	  
			  
}
