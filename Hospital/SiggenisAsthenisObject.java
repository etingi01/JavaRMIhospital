import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
 
public class SiggenisAsthenisObject extends UnicastRemoteObject
	implements IRemoteSiggenisAstheni { 

	
	public SiggenisAsthenisObject() throws RemoteException {
	    super();
	}

public SiggenisAstheni findByKodikosArrostou (int criteria) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}

	return SiggenisAstheniRepository.findByKodikosArrostou(criteria);
}

}