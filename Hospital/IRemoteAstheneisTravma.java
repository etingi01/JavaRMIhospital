import java.rmi.*;
import java.util.ArrayList;
import java.sql.*;
 
/**
 * IRemoteProvince interface
 * @author http://lycog.com
 */
public interface IRemoteAstheneisTravma extends Remote {
  public int save(AstheneisTravma p) throws RemoteException, ClassNotFoundException;
 /* public int update(Province p) throws RemoteException;
  public int delete(Province p) throws RemoteException;
  public void deleteAll() throws RemoteException;
  public ArrayList findAll() throws RemoteException;*/
  public AstheneisTravma findByCodeTravma(int criteria) throws RemoteException, ClassNotFoundException;
  public ArrayList<AstheneisTravma> findByDate(Date criteria) throws RemoteException, ClassNotFoundException;
  public ArrayList<AstheneisTravma> findBykodAstheni(int criteria) throws RemoteException, ClassNotFoundException;

}