import java.rmi.*;
import java.util.ArrayList;
 
/**
 * IRemoteProvince interface
 * @author http://lycog.com
 */
public interface IRemoteProvince extends Remote {
  public int save(Province p) throws RemoteException, ClassNotFoundException;
 /* public int update(Province p) throws RemoteException;
  public int delete(Province p) throws RemoteException;
  public void deleteAll() throws RemoteException;
  public ArrayList findAll() throws RemoteException;*/
  public Province findByUsername(String criteria) throws RemoteException, ClassNotFoundException;
}