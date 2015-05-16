import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class WarningsObject extends UnicastRemoteObject
	implements IRemoteWarnings { 

	
	public WarningsObject() throws RemoteException {
	    super();
	}

	public int save(Warnings p) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke save from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return WarningsRepository.save(p);
	  }

	public ArrayList<Warnings> findByIdDoctor(String criteria) throws ClassNotFoundException{
		  try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return WarningsRepository.findByIdDoctor(criteria);
		  }


	public ArrayList<Warnings> findByKodArrostou(int criteria) throws ClassNotFoundException{
		  try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return WarningsRepository.findByKodArrostou(criteria);
		  }
	public ArrayList<Warnings> findByCodeConsultation(int criteria) throws ClassNotFoundException{
		  try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return WarningsRepository.findByCodeConsultation(criteria);
		  }
	
	public ArrayList<Warnings> findPrimaryAll() throws ClassNotFoundException{
		  try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return WarningsRepository.findPrimaryAll();
		  }
	
}