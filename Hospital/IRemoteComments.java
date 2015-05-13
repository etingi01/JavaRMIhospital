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
  public ArrayList<comments> findByDoctor(int criteria) throws RemoteException, ClassNotFoundException;
  public comments findByDoctorPatient(int patient, int doctor ) throws RemoteException, ClassNotFoundException;

}