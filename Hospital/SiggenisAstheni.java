import java.io.Serializable;
import java.io.Serializable;

public class SiggenisAstheni implements Serializable {
	
	private int codeSIGGENI_;
	private int kodikosArrostou_;
	private String onomaSiggeni_;
	private int tiliefonoSiggeni_;

	public SiggenisAstheni() {
	}
	 
	public SiggenisAstheni(int codeSIGGENI, int kodikosArrostou, String onomaSiggeni, int tiliefonoSiggeni) {
		codeSIGGENI_ = codeSIGGENI;
		kodikosArrostou_ = kodikosArrostou;
		onomaSiggeni_ = onomaSiggeni;
		tiliefonoSiggeni_ = tiliefonoSiggeni;
	}
	 
	public int getCodeSiggeni() {
		return codeSIGGENI_;
	}
		 
	public void setCodeSiggeni (int codeSIGGENI) {
		codeSIGGENI_ = codeSIGGENI;
	}
	  
	public int getKodikosArrostou() {	
		return kodikosArrostou_;
	}
		 
	public void setKodikosArrostou (int KodikosArrostou) {
		kodikosArrostou_ = KodikosArrostou;
	}

	public String getOnomaSiggeni() {
		return onomaSiggeni_;
	}
		 
	public void setOnomaSiggeni(String onomaSiggeni) {
		onomaSiggeni_ = onomaSiggeni;
	}
	  
	public int getTiliefonoSiggeni() {
		return tiliefonoSiggeni_;
	}
		 
	public void setTiliefonoSiggeni(int tiliefonoSiggeni) {
		tiliefonoSiggeni_ = tiliefonoSiggeni;
	}
    
	public String toString() {
		return codeSIGGENI_ + " - " + kodikosArrostou_ + " - " + onomaSiggeni_ + " " + tiliefonoSiggeni_;
	}	  
			  
}
