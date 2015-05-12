import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class AstheneisServer {
 
  public static void main(String[] args) {
    try {
      //Create and get reference to rmi registry
      Registry registry = LocateRegistry.createRegistry(1087);
      //Registry registry2 = LocateRegistry.createRegistry(1092);

      //Instantiate server object
      //ProvinceObject po = new ProvinceObject();
      AstheneisObject ast = new AstheneisObject();

      //Register server object
      //registry.rebind("Province", po);
      registry.rebind("Astheneis", ast);

      System.out.println("ProvinceServer is created!!!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}