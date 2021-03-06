import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.ArrayList;


public class CommentsObject extends UnicastRemoteObject
implements IRemoteComments {


	public CommentsObject() throws RemoteException {
	    super();
	  }
	public int save(comments p) throws ClassNotFoundException {
	    try {
		      System.out.println("Invoke update from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return CommentsRepository.save(p);
	}
	public int update(comments p) throws ClassNotFoundException {
	    try {
	      System.out.println("Invoke update from " + getClientHost());
	    } catch (ServerNotActiveException snae) {
	      snae.printStackTrace();
	    }
	    return CommentsRepository.update(p);
	  }
	public ArrayList<comments> findById(int criteria) throws ClassNotFoundException{
		  try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return CommentsRepository.findById(criteria);
		  }
	
	public ArrayList<comments> findByDoctor(String criteria) throws ClassNotFoundException{
		  try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return CommentsRepository.findByDoctor(criteria);
		  }

	public comments findByDoctorPatient(int patient, String doctor ) throws ClassNotFoundException{
		 try {
		      System.out.println("Invoke findAll from " + getClientHost());
		    } catch (ServerNotActiveException snae) {
		      snae.printStackTrace();
		    }
		    return CommentsRepository.findByDoctorPatient(patient, doctor);
		
		
		
		
	}
		
	



}
