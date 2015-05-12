import java.rmi.server.*;
import java.rmi.*;
 
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

  public Astheneis findByFlag(int criteria) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisRepository.findByFlag(criteria);
	  }
  public Astheneis findByDead(int criteria) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisRepository.findByDead(criteria);
	  }

  
}