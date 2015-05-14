import java.rmi.*;
import java.util.ArrayList;
 
public interface IRemoteRisk  extends Remote {
	
	public int save(Risk p) throws RemoteException, ClassNotFoundException;  
	public ArrayList<Risk> findByCodeGiatros(String criteria)throws RemoteException, ClassNotFoundException;
	public ArrayList<Risk> findByCodeArrostos(int criteria)throws RemoteException, ClassNotFoundException;
	public Risk findByArrostosAndGiatros (int criteria, String criteria1) throws RemoteException, ClassNotFoundException;

}