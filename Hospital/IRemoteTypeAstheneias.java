import java.rmi.*;
import java.util.ArrayList;

public interface IRemoteTypeAstheneias extends Remote {
	public TypeAstheneias findByIdTypeAstheneias(int criteria) throws RemoteException, ClassNotFoundException;
	public ArrayList<TypeAstheneias> findAll() throws RemoteException, ClassNotFoundException;

}