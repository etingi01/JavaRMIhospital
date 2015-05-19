
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
/**
 * ProvinceClient: client application
 * @author http://lycog.com
 */
public class ProvinceClient {
	public Registry registry;
	public IRemoteProvince rp;
	public IRemoteAstheneis as;
	public IRemoteAstheneisAllergies al;
	public IRemoteAstheneisTravma at;
	public IRemoteComments com;
	public IRemoteWarnings warn;
	public IRemoteRisk risk;
	public IRemoteEidiIpallilwn eidiYpal;
	public IRemoteIstorikoTherapeias istoriko;
	public IRemotePatientAstheneies patientAsth;
	public IRemoteSiggenisAstheni siggenis;
	public IRemoteTherapeia therapeia;
	public IRemoteTherapeiesAstheneies therapeiesAstheneies;
	public  IRemoteConsultation consultation;
	public IRemoteTypeAstheneias typeAsth;
	
	public ProvinceClient() throws RemoteException, NotBoundException{
	       registry = LocateRegistry.getRegistry("127.0.0.1");

	       //Lookup server object
	       rp = (IRemoteProvince) registry.lookup("Province");
	       as = (IRemoteAstheneis) registry.lookup("Astheneis");
	       al = (IRemoteAstheneisAllergies) registry.lookup("AstheneisAllergies");
	       at = (IRemoteAstheneisTravma) registry.lookup("AstheneisTravma");
	       com = (IRemoteComments) registry.lookup("comments");
	       warn= (IRemoteWarnings) registry.lookup("warnings");
	       risk = (IRemoteRisk) registry.lookup("risk");
	       eidiYpal = (IRemoteEidiIpallilwn) registry.lookup("eidiYpallilwn");
	       istoriko = (IRemoteIstorikoTherapeias) registry.lookup("istoriko");
	       patientAsth = (IRemotePatientAstheneies) registry.lookup("patientAstheneies");
	       siggenis = (IRemoteSiggenisAstheni) registry.lookup("siggeneis");
	       therapeia = (IRemoteTherapeia) registry.lookup("therapeia");
	       therapeiesAstheneies = (IRemoteTherapeiesAstheneies) registry.lookup("therapeiaAstheneies");
	       consultation = (IRemoteConsultation) registry.lookup("consult");
	       typeAsth = (IRemoteTypeAstheneias) registry.lookup("typeAstheneias");
	       
	}
	
	
	
  public static void main(String[] args) {
    try {
      //Get reference to rmi registry server
    	//System.setProperty("java.rmi.server.hostname","127.0.0.1");
      /* al = (IRemoteAstheneisAllergies) registry.lookup("AstheneisAllergies");
       at = (IRemoteAstheneisTravma) registry.lookup("AstheneisTravma");
       com = (IRemoteComments) registry.lookup("comments");
      warn= (IRemoteWarnings) registry.lookup("warnings");
       risk = (IRemoteRisk) registry.lookup("risk");
       eidiYpal = (IRemoteEidiIpallilwn) registry.lookup("eidiYpallilwn");
       istoriko = (IRemoteIstorikoTherapeias) registry.lookup("istoriko");
      patientAsth = (IRemotePatientAstheneies) registry.lookup("patientAstheneies");
      siggenis = (IRemoteSiggenisAstheni) registry.lookup("siggeneis");
      therapeia = (IRemoteTherapeia) registry.lookup("therapeia");
      therapeiesAstheneies = (IRemoteTherapeiesAstheneies) registry.lookup("therapeiaAstheneies");
      consultation = (IRemoteConsultation) registry.lookup("consult");
      typeAsth = (IRemoteTypeAstheneias) registry.lookup("typeAstheneias");*/
     
      
      
      //Save province
    	Province bmc = new Province(8282, "rlouka01", "Rafaellita", "Louka", "99394781" , "rafkiola@gmail.com", 2);
      	System.out.println("Saving provinces...");
      //rp.save(bmc);
      	ProvinceClient antikeimeno = new ProvinceClient();

      
	    String user = JOptionPane.showInputDialog("Δώστε το username σας");
	    
	    while (antikeimeno.rp.findByUsername(user).getPassword()==0){
	    	user = JOptionPane.showInputDialog("Δώσατε μη υπαρκτό username.\n Δώστε ξανά το username σας");
	    }
	    
	    String pass = JOptionPane.showInputDialog("Δώστε τον κωδικό σας");
	    int passwd = Integer.parseInt(pass);
	    int passwordofIpallilos = antikeimeno.rp.findByUsername(user).getPassword();
	    
	    System.out.println(passwordofIpallilos);
	    while (passwd!=passwordofIpallilos){
		    user = JOptionPane.showInputDialog("Δώσατε λάθος κωδικό. Επαναλάβετε τη διαδικασία. \n Δώστε το username σας");
		    while (antikeimeno.rp.findByUsername(user).getPassword()==0){
		    	user = JOptionPane.showInputDialog("Δώσατε μη υπαρκτό username.\n Δώστε ξανά το username σας");
		    }
		    pass = JOptionPane.showInputDialog("Δώστε τον κωδικό σας");
		    passwd = Integer.parseInt(pass);
		    passwordofIpallilos = antikeimeno.rp.findByUsername(user).getPassword();
	    }
	    Province ipallilos = new Province();
	    ipallilos=antikeimeno.rp.findByUsername(user);
	    
	 /*   switch (ipallilos.getCodeType()){
	    
	    case 1:
	    		
	    		EpifaneiaReceptionist(ipallilos);
	    		break;
	    case 2: EpifaneiaDoctor(ipallilos);
	    		break;
	    case 3: EpifaneiaNurse(ipallilos);
	    		break;
	    case 4: EpifaneiaHealthVisitor(ipallilos);
	    		break;
	    case 5: EpifaneiaMedicalRecordsStaff(ipallilos);
	    		break;
	    case 6: EpifaneiaManagers(ipallilos);
	    		break;
	    }*/
	    
	    

    } catch (Exception e) {
        System.out.println(e);
      }
  }
}