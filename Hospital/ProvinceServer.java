import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 * Server
 * @author http://lycog.com
 */
public class ProvinceServer {
 
  public static void main(String[] args) {
    try {
    	Registry registry;
      //Create and get reference to rmi registry
      //Registry registry = LocateRegistry.createRegistry(1099);
      //Registry registry2 = LocateRegistry.createRegistry(1092);
    	try {
    	    registry = LocateRegistry.createRegistry(1099);
    	} catch (ExportException ex) {
    	   registry = LocateRegistry.getRegistry(1099);
    	} 
    	//Instantiate server object
      ProvinceObject po = new ProvinceObject();
      AstheneisObject ast = new AstheneisObject();

      //Register server object
      registry.rebind("Province", po);
      registry.rebind("Astheneis", ast);

      System.out.println("ProvinceServer is created!!!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}