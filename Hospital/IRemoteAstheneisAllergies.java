import java.rmi.*;
import java.util.ArrayList;
 
/**
 * IRemoteProvince interface
 * @author http://lycog.com
 */
public interface IRemoteAstheneisAllergies extends Remote {
  public int save(AstheneisAllergies p) throws RemoteException, ClassNotFoundException;

 /* public int update(Province p) throws RemoteException;
  public int delete(Province p) throws RemoteException;
  public void deleteAll() throws RemoteException;
  public ArrayList findAll() throws RemoteException;*/
  public AstheneisAllergies findByKodikosPatient(int criteria) throws RemoteException, ClassNotFoundException;
}