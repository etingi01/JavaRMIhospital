import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class RiskObject extends UnicastRemoteObject
	implements IRemoteRisk { 

	
	public RiskObject() throws RemoteException {
	    super();
	}

	public int save(Risk p) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke save from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return RiskRepository.save(p);
	  }
	
	 
public ArrayList<Risk> findByCodeArrostos (int criteria) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}

	return RiskRepository.findByCodeArrostos(criteria);
}


public ArrayList<Risk> findByCodeGiatros (int criteria) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}

	return RiskRepository.findByCodeGiatros (criteria);
}

public Risk findByArrostosAndGiatros (int criteria, int criteria1) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}

	return RiskRepository.findByArrostosAndGiatros (criteria, criteria1);
}

}