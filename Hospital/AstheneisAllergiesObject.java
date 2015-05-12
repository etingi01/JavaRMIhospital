import java.rmi.server.*;
import java.rmi.*;
 
public class AstheneisAllergiesObject extends UnicastRemoteObject
	implements IRemoteAstheneisAllergies { 

	
	public AstheneisAllergiesObject() throws RemoteException {
	    super();
	}


	public int save(AstheneisAllergies p) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke save from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisAllergiesRepository.save(p);
	  }
	
	 
public AstheneisAllergies findByKodikosPatient(int criteria) throws ClassNotFoundException {
		    try {
		      System.out.println("Invoke findByName from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return AstheneisAllergiesRepository.findByKodikosPatient(criteria);
		  }

	 
}