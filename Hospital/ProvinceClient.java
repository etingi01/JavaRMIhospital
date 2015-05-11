
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
 
/**
 * ProvinceClient: client application
 * @author http://lycog.com
 */
public class ProvinceClient {
 
  public static void main(String[] args) {
    try {
      //Get reference to rmi registry server
      Registry registry = LocateRegistry.getRegistry("127.0.0.1");
 
      //Lookup server object
      IRemoteProvince rp = (IRemoteProvince) registry.lookup("Province");
 
      //Save province
      Province bmc = new Province(8282, "rlouka01", "Rafaellita", "Louka", "99394781" , "rafkiola@gmail.com", 2);
      System.out.println("Saving provinces...");
      //rp.save(bmc);
      Province login = rp.findByUsername("antonis");
      System.out.println(login.toString());
      
  
    } catch (Exception e) {
        System.out.println(e);
      }
  }
}