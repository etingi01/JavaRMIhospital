
import java.rmi.*;
import java.util.ArrayList;

public interface IRemoteIstorikoTherapeias extends Remote {
	public ArrayList<IstorikoTherapeias> findByCodeTherapeias (int criteria) throws RemoteException, ClassNotFoundException;
	public int save(IstorikoTherapeias p) throws RemoteException, ClassNotFoundException;
}

