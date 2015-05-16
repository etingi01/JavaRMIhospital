
import java.rmi.*;
import java.util.ArrayList;
 
/**
 * IRemoteProvince interface
 * @author http://lycog.com
 */
public interface  IRemoteWarnings extends Remote {
  public int save( Warnings p) throws RemoteException, ClassNotFoundException;
 
  public ArrayList<Warnings> findByIdDoctor(String criteria) throws RemoteException, ClassNotFoundException;
  public ArrayList<Warnings> findByKodArrostou(int criteria) throws RemoteException, ClassNotFoundException;
  public ArrayList<Warnings> findByCodeConsultation(int criteria) throws RemoteException, ClassNotFoundException;
  public ArrayList<Warnings> findPrimaryAll()throws RemoteException, ClassNotFoundException;
}