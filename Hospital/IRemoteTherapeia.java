import java.rmi.*;
import java.util.ArrayList;
 
public interface IRemoteTherapeia extends Remote {

	public int save (Therapeia p) throws RemoteException, ClassNotFoundException;
	public Therapeia findByTherapeia (int criteria) throws RemoteException, ClassNotFoundException;

}