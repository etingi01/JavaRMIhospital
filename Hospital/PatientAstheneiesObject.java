import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class PatientAstheneiesObject extends UnicastRemoteObject
	implements IRemotePatientAstheneies { 

	
	public PatientAstheneiesObject() throws RemoteException {
	    super();
	}

	public int save(PatientAstheneies p) throws ClassNotFoundException {
	    try {
	    	System.out.println("Invoke save from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	    	snae.printStackTrace();
	    }
	    return PatientAstheneiesRepository.save(p);
	  }
	 
	public ArrayList<PatientAstheneies> findByCodeAstheni (int criteria) throws ClassNotFoundException {
		try {
			System.out.println("Invoke findByName from " + getClientHost());
		} catch (ServerNotActiveException snae) {
			snae.printStackTrace();
		}
		return PatientAstheneiesRepository.findByCodeAstheni(criteria);
	}

	public ArrayList<PatientAstheneies> findByCodeArrwstias (int criteria) throws ClassNotFoundException {
		try {
			System.out.println("Invoke findByName from " + getClientHost());
		} catch (ServerNotActiveException snae) {
			snae.printStackTrace();
		}
		return PatientAstheneiesRepository.findByCodeArrwstias(criteria);
	}
	 
}