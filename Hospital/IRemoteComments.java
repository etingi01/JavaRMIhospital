import java.rmi.*;
import java.util.ArrayList;
 
/**
 * IRemoteProvince interface
 * @author http://lycog.com
 */
public interface IRemoteComments extends Remote {
  public int save(comments p) throws RemoteException, ClassNotFoundException;
  public int update(comments p) throws RemoteException, ClassNotFoundException;
  public ArrayList<comments> findById(int criteria) throws RemoteException, ClassNotFoundException;
  public ArrayList<comments> findByDoctor(String criteria) throws RemoteException, ClassNotFoundException;
  public comments findByDoctorPatient(int patient, String doctor ) throws RemoteException, ClassNotFoundException;
}