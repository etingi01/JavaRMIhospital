import java.io.Serializable;
import java.sql.*;
public class AstheneisTravma implements Serializable {
	private int codeTravma_;
	private int kodAstheni_;
	private String description_;
	private Date imerominiaTravma_;

	public AstheneisTravma(){
		
	}
	
	public AstheneisTravma(int codeTravma, int kodAstheni, String description, Date imerominiaTravma){
		codeTravma_ =codeTravma;
		kodAstheni_ = kodAstheni;
		description_=description;
		imerominiaTravma_=imerominiaTravma;
	}
	
	public int getCodeTravma(){
		return codeTravma_;
	}
	
	public void setCodeTravma(int codeTravma){
		codeTravma_=codeTravma;
	}
	
	public int getKodAstheni(){
		return kodAstheni_;
	}
	public void setKodAstheni(int kodAstheni){
		kodAstheni_=kodAstheni;
	}
	public String getDesctription(){
		return description_;
	}
	public void setDesctription(String description){
		description_=description;
	}
	public Date getImerominiaTravma(){
		return imerominiaTravma_;
	}
	public void setImerominiaTravma(Date imerominiaTravma){
		imerominiaTravma_=imerominiaTravma;
	}
	

    public String toString() {
  	    return kodAstheni_ + " - " + codeTravma_ + " - " + description_ + " - " + imerominiaTravma_;
  	  }	  
	  
}
