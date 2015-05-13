
import java.rmi.*;
import java.util.ArrayList;

public interface IRemotePatientAstheneies  extends Remote {
  
	public ArrayList<PatientAstheneies> findByCodeAstheni (int criteria)throws RemoteException, ClassNotFoundException;
	public int save (PatientAstheneies p) throws RemoteException, ClassNotFoundException;
	public ArrayList<PatientAstheneies> findByCodeArrwstias (int criteria)throws RemoteException, ClassNotFoundException;

}