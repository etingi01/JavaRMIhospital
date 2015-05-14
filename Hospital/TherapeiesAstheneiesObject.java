import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class TherapeiesAstheneiesObject extends UnicastRemoteObject
	implements IRemoteTherapeiesAstheneies { 

	
	public TherapeiesAstheneiesObject() throws RemoteException {
	    super();
	}

	public int save(TherapeiesAstheneies p) throws ClassNotFoundException {
	    try {
	    	System.out.println("Invoke save from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	    	snae.printStackTrace();
	    }
	    return TherapeiesAstheneiesRepository.save(p);
	  }
	
	 
	public TherapeiesAstheneies findByTherapeiaAndAstheneia (int criteria, int cirteria2) throws ClassNotFoundException {
		try {
			System.out.println("Invoke findByName from " + getClientHost());
		} catch (ServerNotActiveException snae) {
			snae.printStackTrace();
		}
		return TherapeiesAstheneiesRepository.findByTherapeiaAndAstheneia(criteria, cirteria2);
	}

	public ArrayList<TherapeiesAstheneies> findByTherapeia (int criteria) throws ClassNotFoundException {
		try {
			System.out.println("Invoke findByName from " + getClientHost());
		} catch (ServerNotActiveException snae) {
			snae.printStackTrace();
		}
		return TherapeiesAstheneiesRepository.findByTherapeia(criteria);
	}

	public ArrayList<TherapeiesAstheneies> findByAstheneia (int criteria) throws ClassNotFoundException {
		try {
			System.out.println("Invoke findByName from " + getClientHost());
		} catch (ServerNotActiveException snae) {
			snae.printStackTrace();
		}
		return TherapeiesAstheneiesRepository.findByAstheneia(criteria);
	}
	
	
}