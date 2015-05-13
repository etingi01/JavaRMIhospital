import java.rmi.*;
import java.util.ArrayList;
 
public interface IRemoteEidiIpallilwn extends Remote {
	public ArrayList<EidiIpallilwn> findByCodeEidikotitas (int criteria)throws RemoteException, ClassNotFoundException;

}

