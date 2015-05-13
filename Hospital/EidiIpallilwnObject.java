import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class EidiIpallilwnObject extends UnicastRemoteObject
        implements IRemoteEidiIpallilwn {
	
	public EidiIpallilwnObject() throws RemoteException {
		super();
	}
 
	public ArrayList<EidiIpallilwn> findByCodeEidikotitas(int criteria) throws ClassNotFoundException {
	    try {
	    	System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	    	snae.printStackTrace();
	    }
	    
	    return EidiIpallilwnRepository.findByCodeEidikotitas(criteria);
	  }
  
}