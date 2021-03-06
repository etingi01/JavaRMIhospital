import java.rmi.server.*;
import java.rmi.*;
import java.sql.Date;
import java.util.ArrayList;
 
/**
 * Server object
 * @author http://lycog.com
 */
public class AstheneisTravmaObject extends UnicastRemoteObject
        implements IRemoteAstheneisTravma {
	
	public AstheneisTravmaObject() throws RemoteException {
	    super();
	  }
	public int save(AstheneisTravma p) throws RemoteException, ClassNotFoundException{
	try {
	      System.out.println("Invoke update from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisTravmaRepository.save(p);
	  }


	public AstheneisTravma findByCodeTravma(int criteria) throws RemoteException, ClassNotFoundException{
	 try {
	      System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisTravmaRepository.findByCodeTravma(criteria);
	  }


	public ArrayList<AstheneisTravma> findByDate(Date criteria) throws ClassNotFoundException{
	  try {
	      System.out.println("Invoke findAll from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return AstheneisTravmaRepository.findByDate(criteria);
	  }
 
	public ArrayList<AstheneisTravma> findBykodAstheni(int criteria) throws ClassNotFoundException{
		  try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return AstheneisTravmaRepository.findBykodAstheni(criteria);
		  }
	
}