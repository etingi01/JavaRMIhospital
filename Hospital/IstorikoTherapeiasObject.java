
import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class IstorikoTherapeiasObject extends UnicastRemoteObject
        implements IRemoteIstorikoTherapeias {

	public IstorikoTherapeiasObject () throws RemoteException {
		super();
	}
 
	public int save(IstorikoTherapeias p) throws ClassNotFoundException {
	    try {
	    	System.out.println("Invoke update from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	    	snae.printStackTrace();
	    }
	    
	    return IstorikoTherapeiasRepository.save(p);
	 }
  
	public  ArrayList<IstorikoTherapeias> findByCodeTherapeias(int criteria) throws ClassNotFoundException {
	    try {
	    	System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	    	snae.printStackTrace();
	    }
	    
	    return IstorikoTherapeiasRepository.findByCodeTherapeias(criteria);
	  }

  
}