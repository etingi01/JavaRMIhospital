
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.ArrayList;
 
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
      //Save province
      Province bmc = new Province(8282, "rlouka01", "Rafaellita", "Louka", "99394781" , "rafkiola@gmail.com", 2);
      System.out.println("Saving provinces...");
      //rp.save(bmc);
      Province login = rp.findByUsername("antonis");
      System.out.println(login.toString());
      
      Astheneis as1 = as.findById(1);      
      System.out.println(as1.toString());
    
      //AstheneisAllergies al1 = al.findByKodikosPatient(2);
      //System.out.println(al1.toString());

      AstheneisTravma at1 = at.findByCodeTravma(1);
      System.out.println(at1.toString());
      
  
    } catch (Exception e) {
        System.out.println(e);
      }
  }
}