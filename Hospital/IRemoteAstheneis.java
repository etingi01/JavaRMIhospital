import java.rmi.*;
import java.util.ArrayList;
 
/**
 * IRemoteProvince interface
 * @author http://lycog.com
 */
public interface IRemoteAstheneis extends Remote {
  public int update(Astheneis p) throws RemoteException, ClassNotFoundException;
 /* public int update(Province p) throws RemoteException;
  public int delete(Province p) throws RemoteException;
  public void deleteAll() throws RemoteException;
  public ArrayList findAll() throws RemoteException;*/
  public Astheneis findById(int criteria) throws RemoteException, ClassNotFoundException;
  public Astheneis findByFlag(int criteria) throws RemoteException, ClassNotFoundException;
  public Astheneis findByDead(int criteria) throws RemoteException, ClassNotFoundException;

}