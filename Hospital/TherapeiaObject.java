import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class TherapeiaObject extends UnicastRemoteObject
	implements IRemoteTherapeia { 
	
	public TherapeiaObject() throws RemoteException {
	    super();
	}

	public int save (Therapeia p) throws ClassNotFoundException {
	    try {
	    	System.out.println("Invoke save from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	    	snae.printStackTrace();
	    }
	    
	    return TherapeiaRepository.save(p);
	  }
	 	
	public Therapeia findByTherapeia (int criteria) throws ClassNotFoundException {
		try {
			System.out.println("Invoke findByName from " + getClientHost());
		} catch (ServerNotActiveException snae) {
			snae.printStackTrace();
		}
	
		return TherapeiaRepository.findByTherapeia (criteria);
	}

}