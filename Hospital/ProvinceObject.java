import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
/**
 * Server object
 * @author http://lycog.com
 */
public class ProvinceObject extends UnicastRemoteObject
        implements IRemoteProvince {
 
  public ProvinceObject() throws RemoteException {
    super();
  }
 
  public int save(Province p) throws ClassNotFoundException {
    try {
      System.out.println("Invoke save from " + getClientHost());
    } catch (ServerNotActiveException snae) {
      snae.printStackTrace();
    }
    return ProvinceRepository.save(p);
  }
 
  /*public int update(Province p) {
    try {
      System.out.println("Invoke update from " + getClientHost());
    } catch (ServerNotActiveException snae) {
      snae.printStackTrace();
    }
    return ProvinceRepository.update(p);
  }
 
  public int delete(Province p) {
    try {
      System.out.println("Invoke delete from " + getClientHost());
    } catch (ServerNotActiveException snae) {
      snae.printStackTrace();
    }
    return ProvinceRepository.delete(p);
  }
 
  public void deleteAll() {
    try {
      System.out.println("Invoke deleteAll from " + getClientHost());
    } catch (ServerNotActiveException snae) {
      snae.printStackTrace();
    }
    ProvinceRepository.deleteAll();
  }
 
  public ArrayList findAll() {
    try {
      System.out.println("Invoke findAll from " + getClientHost());
    } catch (ServerNotActiveException snae) {
      snae.printStackTrace();
    }
    return ProvinceRepository.findAll();
  }*/
 
  public Province findByUsername(String criteria) throws ClassNotFoundException {
    try {
      System.out.println("Invoke findByName from " + getClientHost());
    } catch (ServerNotActiveException snae) {
      snae.printStackTrace();
    }
    return ProvinceRepository.findByUsername(criteria);
  }
  public ArrayList<Province> findAll() throws ClassNotFoundException{
	  try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return ProvinceRepository.findAll();
  }
}