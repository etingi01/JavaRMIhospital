import java.rmi.*;
import java.util.ArrayList;

public interface IRemoteSiggenisAstheni  extends Remote {

	public SiggenisAstheni findByKodikosArrostou (int criteria)throws RemoteException, ClassNotFoundException;

}