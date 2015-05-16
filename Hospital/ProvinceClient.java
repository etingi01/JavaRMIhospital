
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
 
  public static void main(String[] args) {
    try {
      //Get reference to rmi registry server
    	//System.setProperty("java.rmi.server.hostname","127.0.0.1");
      Registry registry = LocateRegistry.getRegistry("127.0.0.1");

      //Lookup server object
      IRemoteProvince rp = (IRemoteProvince) registry.lookup("Province");
      System.out.println("astheneis lookup");
      IRemoteAstheneis as = (IRemoteAstheneis) registry.lookup("Astheneis");
      IRemoteAstheneisAllergies al = (IRemoteAstheneisAllergies) registry.lookup("AstheneisAllergies");
      IRemoteAstheneisTravma at = (IRemoteAstheneisTravma) registry.lookup("AstheneisTravma");
      IRemoteComments com = (IRemoteComments) registry.lookup("comments");
      IRemoteWarnings warn= (IRemoteWarnings) registry.lookup("warnings");
      IRemoteRisk risk = (IRemoteRisk) registry.lookup("risk");
      IRemoteEidiIpallilwn eidiYpal = (IRemoteEidiIpallilwn) registry.lookup("eidiYpallilwn");
      IRemoteIstorikoTherapeias istoriko = (IRemoteIstorikoTherapeias) registry.lookup("istoriko");
      IRemotePatientAstheneies patientAsth = (IRemotePatientAstheneies) registry.lookup("patientAstheneies");
      IRemoteSiggenisAstheni siggenis = (IRemoteSiggenisAstheni) registry.lookup("siggeneis");
      IRemoteTherapeia therapeia = (IRemoteTherapeia) registry.lookup("therapeia");
      IRemoteTherapeiesAstheneies therapeiesAstheneies = (IRemoteTherapeiesAstheneies) registry.lookup("therapeiaAstheneies");
      IRemoteConsultation consultation = (IRemoteConsultation) registry.lookup("consult");
      IRemoteTypeAstheneias typeAsth = (IRemoteTypeAstheneias) registry.lookup("typeAstheneias");
     
      
      
      //Save province
      Province bmc = new Province(8282, "rlouka01", "Rafaellita", "Louka", "99394781" , "rafkiola@gmail.com", 2);
      System.out.println("Saving provinces...");
      //rp.save(bmc);

      
	    String user = JOptionPane.showInputDialog("Δώστε το username σας");
	    
	    while (rp.findByUsername(user).getPassword()==0){
	    	user = JOptionPane.showInputDialog("Δώσατε μη υπαρκτό username.\n Δώστε ξανά το username σας");
	    }
	    String pass = JOptionPane.showInputDialog("Δώστε τον κωδικό σας");
	    int passwd = Integer.parseInt(pass);
	    int passwordofIpallilos = rp.findByUsername(user).getPassword();
	    
	    System.out.println(passwordofIpallilos);
	    while (passwd!=passwordofIpallilos){
		    user = JOptionPane.showInputDialog("Δώσατε λάθος κωδικό. Επαναλάβετε τη διαδικασία. \n Δώστε το username σας");
		    while (rp.findByUsername(user).getPassword()==0){
		    	user = JOptionPane.showInputDialog("Δώσατε μη υπαρκτό username.\n Δώστε ξανά το username σας");
		    }
		    pass = JOptionPane.showInputDialog("Δώστε τον κωδικό σας");
		    passwd = Integer.parseInt(pass);
		    passwordofIpallilos = rp.findByUsername(user).getPassword();
	    }
	    
	    
	    

    } catch (Exception e) {
        System.out.println(e);
      }
  }
}