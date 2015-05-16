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
      AstheneisAllergiesObject all = new AstheneisAllergiesObject();
      AstheneisTravmaObject    att = new AstheneisTravmaObject();
      CommentsObject cm = new CommentsObject();
      WarningsObject wr = new WarningsObject(); 
      RiskObject ris = new  RiskObject();
      EidiIpallilwnObject eidi = new EidiIpallilwnObject();
      IstorikoTherapeiasObject istor = new IstorikoTherapeiasObject();
      PatientAstheneiesObject patasth = new PatientAstheneiesObject();
      SiggenisAsthenisObject sig = new SiggenisAsthenisObject();
      TherapeiaObject ther = new TherapeiaObject();
      TherapeiesAstheneiesObject therasth = new TherapeiesAstheneiesObject();
      ConsultationObject cons = new ConsultationObject();
      TypeAstheneiasObject type = new TypeAstheneiasObject();
      
      
      //Register server object
      registry.rebind("Province", po);
      registry.rebind("Astheneis", ast);
      registry.rebind("AstheneisAllergies", all);
      registry.rebind("AstheneisTravma", att);
      registry.rebind("comments", cm);
      registry.rebind("warnings", wr);
      registry.rebind("risk", ris);
      registry.rebind("eidiYpallilwn", eidi);
      registry.rebind("istoriko", istor);
      registry.rebind("patientAstheneies", patasth);
      registry.rebind("siggeneis", sig);
      registry.rebind("therapeia", ther);
      registry.rebind("therapeiaAstheneies", therasth);
      registry.rebind("consult", cons);
      registry.rebind("typeAstheneias", type);



      
      

      System.out.println("ProvinceServer is created!!!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}