import java.rmi.*;
import java.util.ArrayList;

public interface IRemoteTherapeiesAstheneies extends Remote {

	public int save (TherapeiesAstheneies p) throws RemoteException, ClassNotFoundException;
	public TherapeiesAstheneies findByTherapeiaAndAstheneia (int criteria, int criteria1) throws RemoteException, ClassNotFoundException;
	public ArrayList<TherapeiesAstheneies> findByTherapeia (int criteria) throws RemoteException, ClassNotFoundException;
	public ArrayList<TherapeiesAstheneies> findByAstheneia (int criteria) throws RemoteException, ClassNotFoundException;

}