import java.rmi.*;
import java.sql.Date;
import java.util.ArrayList;

public interface IRemoteConsultation extends Remote {
	public int save(Consultation p) throws RemoteException, ClassNotFoundException;
	public ArrayList<Consultation> findByKodPatient (int criteria) throws RemoteException, ClassNotFoundException;
	public ArrayList<Consultation> findByDoctorUsername (String criteria) throws RemoteException, ClassNotFoundException;
	public ArrayList<Consultation> findByImerominia (Date criteria) throws RemoteException, ClassNotFoundException;
	public ArrayList<Consultation> findByEmfanistike (int criteria) throws RemoteException, ClassNotFoundException;

}