import java.rmi.*;
import java.util.ArrayList;
 
public interface IRemoteRisk  extends Remote {
  
	public ArrayList<Risk> findByCodeGiatros(int criteria)throws RemoteException, ClassNotFoundException;
	public int save(Risk p) throws RemoteException, ClassNotFoundException;
	public ArrayList<Risk> findByCodeArrostos(int criteria)throws RemoteException, ClassNotFoundException;
	public Risk findByArrostosAndGiatros (int criteria, int criteria1) throws RemoteException, ClassNotFoundException;

}