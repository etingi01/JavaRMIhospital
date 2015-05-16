import java.rmi.server.*;
import java.rmi.*;
import java.sql.Date;
import java.util.ArrayList;
 
public class ConsultationObject extends UnicastRemoteObject
	implements IRemoteConsultation { 

	public ConsultationObject () throws RemoteException {
	    super();
	}

	public int save(Consultation p) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke save from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return ConsultationRepository.save(p);
	  }
	
	 
public ArrayList<Consultation> findByKodPatient (int criteria) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}
	return ConsultationRepository.findByKodPatient(criteria);
}


public ArrayList<Consultation> findByDoctorUsername (String criteria) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}
	return ConsultationRepository.findByDoctorUsername (criteria);
}

public ArrayList<Consultation> findByImerominia(Date criteria) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}
	return ConsultationRepository.findByImerominia (criteria);
}

public  ArrayList<Consultation> findByEmfanistike (int criteria) throws ClassNotFoundException {
	try {
		System.out.println("Invoke findByName from " + getClientHost());
	} catch (ServerNotActiveException snae) {
		snae.printStackTrace();
	}
	return ConsultationRepository.findByEmfanistike (criteria);
}
}