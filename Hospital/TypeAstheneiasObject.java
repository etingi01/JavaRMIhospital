import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class TypeAstheneiasObject extends UnicastRemoteObject
        implements IRemoteTypeAstheneias {
	
	public TypeAstheneiasObject() throws RemoteException {
		super();
	}
 
	public TypeAstheneias findByIdTypeAstheneias(int criteria) throws ClassNotFoundException {
	    try {
	    	System.out.println("Invoke findByName from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	    	snae.printStackTrace();
	    }
	    
	    return TypeAstheneiasRepostitory.findByIdTypeAstheneias(criteria);
	  }
  
}