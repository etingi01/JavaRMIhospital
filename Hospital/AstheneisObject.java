import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
/**
 * Server object
 * @author http://lycog.com
 */
public class AstheneisObject extends UnicastRemoteObject
        implements IRemoteAstheneis {
 
  /**
	 * 
	 */
	public AstheneisObject() throws RemoteException {
    super();
  }
 
  public int update(Astheneis p) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke update from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisRepository.update(p);
	  }
  public Astheneis findById(int criteria) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisRepository.findById(criteria);
	  }

  public ArrayList<Astheneis> findByFlag(int criteria) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisRepository.findByFlag(criteria);
	  }
  public ArrayList<Astheneis> findByDead(int criteria) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisRepository.findByDead(criteria);
	  }
  public ArrayList<Astheneis> findAll() throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisRepository.findAll();
	  }
  
}