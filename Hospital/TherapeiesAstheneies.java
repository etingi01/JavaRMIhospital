import java.io.Serializable;
import java.io.Serializable;
import java.sql.*;

public class TherapeiesAstheneies implements Serializable {
	
	
	private int codeAstheneias_;
	private int therapeiaCode_;
	private Date imerominiaTA_;

	public TherapeiesAstheneies() {
	}
	 
	public TherapeiesAstheneies(int codeAstheneias, int therapeiaCode, Date imerominiaTA) {
		codeAstheneias_ = codeAstheneias;
		therapeiaCode_ = therapeiaCode;
		imerominiaTA_ = imerominiaTA;
	}
	 
	public int getCodeAstheneias() {
		return codeAstheneias_;
	}
		 
	public void setCodeAstheneias (int codeAstheneias) {
		codeAstheneias_ = codeAstheneias;
	}
	  
	public int getTherapeiaCode() {
		return therapeiaCode_;
	}
		 
	public void setTherapeiaCode(int therapeiaCode) {
		therapeiaCode_ = therapeiaCode;
	}

	public Date getImerominiaTA() {
		return imerominiaTA_;
	}
		 
	public void setImerominiaTA(Date imerominiaTA) {
		imerominiaTA_ = imerominiaTA;
	}
	  
    public String toString() {
    	return codeAstheneias_ + " - " + therapeiaCode_ + " - " + imerominiaTA_;
    }	  
			  
}
