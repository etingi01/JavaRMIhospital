import static org.junit.Assert.*;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import org.junit.Test;


public class ProvinceClientTest {

	private static ProvinceRepository pc;
	private static AstheneisRepository astheneis;

	@Test
	public void test() throws RemoteException, NotBoundException {
		pc = new ProvinceRepository();
	}

	@Test
	public final void testProvinceDoctorUsername() throws RemoteException, ClassNotFoundException {
		Province temp = pc.findByUsername("kiriakos");
		String doctor = "kiriakos";
		String doctorSurname = "Kiriakou";
		assertEquals("Error in Province findByUsername()! ", doctor, temp.getOnoma());
		assertEquals("Error in Province findByUsername()! ", doctorSurname, temp.getEpwnimo());

	}
	
	@Test
	public final void testProvincefindAll() throws RemoteException, ClassNotFoundException {
		ArrayList<Province> temp = pc.findAll();
		assertEquals("Error in Province findAll()! ", 9, temp.size());
	}	
	
	@Test
	public final void testAstheneisId() throws RemoteException, ClassNotFoundException {
		Astheneis temp = astheneis.findById(1);
		String name = "Evanthia";
		String surname = "Tingiri";
		assertEquals("Error in Astheneis findById()! ", name, temp.getOnoma());
		assertEquals("Error in Astheneis findById()! ", surname, temp.getEpwnimo());
		
		Astheneis temp2 = astheneis.findById(2);
		String name2 = "Rafaela";
		String surname2 = "Louka";
		assertEquals("Error in Astheneis findById()! ", name, temp.getOnoma());
		assertEquals("Error in Astheneis findById()! ", surname, temp.getEpwnimo());
	}
	
	@Test
	public final void testAstheneisAll() throws RemoteException, ClassNotFoundException {
		ArrayList<Astheneis> temp = astheneis.findAll();
		assertEquals("Error in Astheneis findAll()! ", 5, temp.size());
	}
	
}
