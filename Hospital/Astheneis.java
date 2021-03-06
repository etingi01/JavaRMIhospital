import java.io.Serializable;

public class Astheneis implements Serializable {
	
	private int idAstheneis_;
	private String onoma_;
	private String epwnimo_;
	private String tilefwno_;
	private String diefthinsi_;
	private String email_;
	private int flag_;
	private int dead_;
	

	  public Astheneis() {
	  }

	  public Astheneis(int idAstheneis, String onoma, String epwnimo, String tilefwno, String diefthinsi, String email, int flag, int dead) {
		  idAstheneis_ = idAstheneis;
		  onoma_= onoma;
		  epwnimo_ = epwnimo;
		  tilefwno_=tilefwno;
		  diefthinsi_ = diefthinsi;
		  email_ = email;
		  flag_ = flag;
		  dead_= dead;
	  }
	 
	  public int getIdAstheneis() {
		    return idAstheneis_;
		  }
		 
	  public void setIdAstheneis(int  idAstheneis ) {
			  idAstheneis_ = idAstheneis;
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
				 
		public void setEpwnimo(String  epwnimo ) {
			epwnimo_ = epwnimo;
				  }	  
		 
	  
		public String getTilefwno() {
		    return 	tilefwno_;
		  }

        public void setTilefwno(String   tilefwno) {
        	tilefwno_ =  tilefwno;
		  }	  
        

        public String getDiefthinsi() {
  		  return diefthinsi_ ;
		  }	  
        
         public void setDiefthinsi(String   diefthinsi) {
   		  diefthinsi_ =  diefthinsi;
		  }	  
         
         public String getEmail() {
 		    return 	email_;
 		  }
 		 
          public void setEmail(String   email) {
        	  email_ =  email;
 		  }	  
          
          public int getFlag() {
  		    return 	flag_ ;
  		  }
  		 
           public void setFlag(int  flag) {
        	   flag_  =  flag;
  		  }	  
           		  
           public int getDead() {
     		    return 	dead_ ;
     		  }
     		 
              public void setDead(int  dead) {
            	  dead_  =  dead;
     		  }	  
              		    
			  
              public String toString() {
            	    return idAstheneis_ + " - " + onoma_ + " - " + epwnimo_ + " - " + tilefwno_ + " - "+  email_ + " - " + dead_  + " - " + flag_;
            	  }	  
			  
}
