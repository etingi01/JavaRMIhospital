
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
/**
 * ProvinceClient: client application
 * @author http://lycog.com
 */
public class ProvinceClient {
	public Registry registry;
	public IRemoteProvince rp;
	public IRemoteAstheneis as;
	public IRemoteAstheneisAllergies al;
	public IRemoteAstheneisTravma at;
	public IRemoteComments com;
	public IRemoteWarnings warn;
	public IRemoteRisk risk;
	public IRemoteEidiIpallilwn eidiYpal;
	public IRemoteIstorikoTherapeias istoriko;
	public IRemotePatientAstheneies patientAsth;
	public IRemoteSiggenisAstheni siggenis;
	public IRemoteTherapeia therapeia;
	public IRemoteTherapeiesAstheneies therapeiesAstheneies;
	public  IRemoteConsultation consultation;
	public IRemoteTypeAstheneias typeAsth;
	
	public ProvinceClient() throws RemoteException, NotBoundException{
	       registry = LocateRegistry.getRegistry("127.0.0.1");

	       //Lookup server object
	       rp = (IRemoteProvince) registry.lookup("Province");
	       as = (IRemoteAstheneis) registry.lookup("Astheneis");
	       al = (IRemoteAstheneisAllergies) registry.lookup("AstheneisAllergies");
	       at = (IRemoteAstheneisTravma) registry.lookup("AstheneisTravma");
	       com = (IRemoteComments) registry.lookup("comments");
	       warn= (IRemoteWarnings) registry.lookup("warnings");
	       risk = (IRemoteRisk) registry.lookup("risk");
	       eidiYpal = (IRemoteEidiIpallilwn) registry.lookup("eidiYpallilwn");
	       istoriko = (IRemoteIstorikoTherapeias) registry.lookup("istoriko");
	       patientAsth = (IRemotePatientAstheneies) registry.lookup("patientAstheneies");
	       siggenis = (IRemoteSiggenisAstheni) registry.lookup("siggeneis");
	       therapeia = (IRemoteTherapeia) registry.lookup("therapeia");
	       therapeiesAstheneies = (IRemoteTherapeiesAstheneies) registry.lookup("therapeiaAstheneies");
	       consultation = (IRemoteConsultation) registry.lookup("consult");
	       typeAsth = (IRemoteTypeAstheneias) registry.lookup("typeAstheneias");
	       
	}
	
	
	
  public static void main(String[] args) {
    try {
      //Get reference to rmi registry server
    	//System.setProperty("java.rmi.server.hostname","127.0.0.1");
      /* al = (IRemoteAstheneisAllergies) registry.lookup("AstheneisAllergies");
       at = (IRemoteAstheneisTravma) registry.lookup("AstheneisTravma");
       com = (IRemoteComments) registry.lookup("comments");
      warn= (IRemoteWarnings) registry.lookup("warnings");
       risk = (IRemoteRisk) registry.lookup("risk");
       eidiYpal = (IRemoteEidiIpallilwn) registry.lookup("eidiYpallilwn");
       istoriko = (IRemoteIstorikoTherapeias) registry.lookup("istoriko");
      patientAsth = (IRemotePatientAstheneies) registry.lookup("patientAstheneies");
      siggenis = (IRemoteSiggenisAstheni) registry.lookup("siggeneis");
      therapeia = (IRemoteTherapeia) registry.lookup("therapeia");
      therapeiesAstheneies = (IRemoteTherapeiesAstheneies) registry.lookup("therapeiaAstheneies");
      consultation = (IRemoteConsultation) registry.lookup("consult");
      typeAsth = (IRemoteTypeAstheneias) registry.lookup("typeAstheneias");*/
     
      
      
      //Save province
    	Province bmc = new Province(8282, "rlouka01", "Rafaellita", "Louka", "99394781" , "rafkiola@gmail.com", 2);
      	System.out.println("Saving provinces...");
      //rp.save(bmc);
      	ProvinceClient antikeimeno = new ProvinceClient();

      
	    String user = JOptionPane.showInputDialog(null,"Δώστε το username σας");
	    
	    if (user != null){
	        while ((antikeimeno.rp.findByUsername(user).getPassword()==0) && (user != null)){
	         user = JOptionPane.showInputDialog("Δώσατε μη υπαρκτό username.\n Δώστε ξανά το username σας");

	        }
	        
	        if (user != null){

	            String pass = JOptionPane.showInputDialog("Δώστε τον κωδικό σας");
	            int passwd = Integer.parseInt(pass);
	            int passwordofIpallilos = antikeimeno.rp.findByUsername(user).getPassword();
	            
	            System.out.println(passwordofIpallilos);
	            while ((passwd!=passwordofIpallilos) && (user != null)){
	            user = JOptionPane.showInputDialog("Δώσατε λάθος κωδικό. Επαναλάβετε τη διαδικασία. \n Δώστε το username σας");
	            while ((antikeimeno.rp.findByUsername(user).getPassword()==0)  && (user != null)){
	             user = JOptionPane.showInputDialog("Δώσατε μη υπαρκτό username.\n Δώστε ξανά το username σας");
	            }
	            if (user != null){
	            pass = JOptionPane.showInputDialog("Δώστε τον κωδικό σας");
	            passwd = Integer.parseInt(pass);
	            passwordofIpallilos = antikeimeno.rp.findByUsername(user).getPassword();
	            } 
	            }
	            }
	    }
	        
	        
	    Province ipallilos = new Province();
	    ipallilos=antikeimeno.rp.findByUsername(user);
	    
	    switch (ipallilos.getCodeType()){
	    
	    case 1:
	    		antikeimeno.EpifaneiaReceptionist(ipallilos);
	    		break;
	   /* case 2: EpifaneiaDoctor(ipallilos);
	    		break;
	    case 3: EpifaneiaNurse(ipallilos);
	    		break;
	    case 4: EpifaneiaHealthVisitor(ipallilos);
	    		break;
	    case 5: EpifaneiaMedicalRecordsStaff(ipallilos);
	    		break;
	    case 6: EpifaneiaManagers(ipallilos);
	    		break;*/
	    }
	    
	    

    } catch (Exception e) {
        System.out.println(e);
      }
  }
	public  void MenuButtons(){
		JFrame fm = new JFrame ("Menu");
	    fm.setLayout( new FlowLayout() );      // set the layout manager
   	    fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	    JButton appointment = new JButton("Προσθήκη Ραντεβού"); // construct a JButton
	    JButton viewApp = new JButton("Προεπισκόπηση Ραντεβού");
	    JButton search = new JButton("Αναζήτηση Εγγραφής");
	    JButton allPatient = new JButton ("Όλοι οι ασθενείς");
	    JButton sintagi = new JButton ("Παραγωγή τελευταίας Συνταγής Ασθενή");
		
	    fm.getContentPane().add(appointment);
	    fm.getContentPane().add(viewApp);
	    fm.getContentPane().add(search);
	    fm.getContentPane().add(allPatient);
	    fm.getContentPane().add(sintagi);	    
	    fm.pack();
   	    fm.setSize( 500, 250);     
   	    fm.setVisible( true ); 
   	 appointment.addActionListener(new ActionListener() {
	    	
            public void actionPerformed(ActionEvent e)
            {
            	appointment();
            }
        });  
   	viewApp.addActionListener(new ActionListener() {
	    	
            public void actionPerformed(ActionEvent e)
            {
            	viewApp();
            }
        });  
   	 
   	search.addActionListener(new ActionListener() {
	    	
            public void actionPerformed(ActionEvent e)
            {
            	search();
                System.out.println("Irthe edw");
            }
        });  
   	allPatient.addActionListener(new ActionListener() {
	    	 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	try {
					allPatient();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
               System.out.println("prosthiki");
            }
        });  
   	sintagi.addActionListener(new ActionListener() {
	    	 
            public void actionPerformed(ActionEvent e)
            {
            	sintagi();
            }
        });  
	}
  public void EpifaneiaReceptionist(Province ipallilos){
	  MenuButtons();
	  
  }
  
  public static void sintagi(){
	  
  }
  
  public void allPatient() throws RemoteException, ClassNotFoundException{
	  
		JFrame frame = new JFrame("Όλοι οι Ασθενείς: ");
		

        frame.setLayout(new BorderLayout());
        String [] categories= {"Όνομα" , "Επώνυμο" , "ID" , "Τηλέφωνο" , "Διεύθυνση" , "Email", "Στοιχεία Συγγενή"};
        ArrayList<Astheneis> arr = as.findAll();
        String[][] data = new String[arr.size()][7];

        for (int j=0; j<arr.size(); j++){
        	Astheneis p = arr.get(j);
        	data[j][0] = p.getOnoma();
        	data[j][1] = p.getEpwnimo();
        	data[j][2] = ""+p.getIdAstheneis();
        	data[j][3] = p.getTilefwno();
        	data[j][4] = p.getDiefthinsi();
        	data[j][5] = p.getEmail();
        	SiggenisAstheni sig = siggenis.findByKodikosArrostou(p.getIdAstheneis());
        	data[j][6] = sig.getOnomaSiggeni() + " \n\n " + sig.getTiliefonoSiggeni();
        }
        
        final JTable table = new JTable(data, categories);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
        frame.setSize(1200, 550);
        frame.setVisible(true);
  }
    public static void search(){
	  
  }
  public static void viewApp(){
	  
  }
  public void appointment(){
		JFrame fm = new JFrame ("Menu Appointments");
	    fm.setLayout( new FlowLayout() );      // set the layout manager
   	    fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	    JButton allApp = new JButton("Όλα τα Ραντεβού"); // construct a JButton
	    JButton appDate = new JButton("Εύρεση ανά Ημερομηνία");
	    JButton astApp = new JButton("Εύρεση ανά Ασθενή");
	    fm.getContentPane().add(allApp);
	    fm.getContentPane().add(appDate);
	    fm.getContentPane().add(astApp);
	    fm.pack();
   	    fm.setSize( 250, 250);     
   	    fm.setVisible( true ); 
   	    allApp.addActionListener(new ActionListener() {
 	    	
             public void actionPerformed(ActionEvent e)
             {
            	 allApp();
             }
         });  
   	    appDate.addActionListener(new ActionListener() {
	    	
         public void actionPerformed(ActionEvent e)
         {
        	// appDate();
         }
   	    });  
   	    astApp.addActionListener(new ActionListener() {
	    	
        public void actionPerformed(ActionEvent e)
        {
        	//astApp();
        }
   	    });  
  }
  
  public void allApp(){
	  JFrame frame = new JFrame("Όλα τα ραντεβού: ");
      frame.setLayout(new BorderLayout());
      String [] categories= {"iD Ασθενή" , "Επώνυμο" , "ID" , "Τηλέφωνο" , "Διεύθυνση" , "Email", "Στοιχεία Συγγενή"};
      ArrayList<Astheneis> arr = as.findAll();
      String[][] data = new String[arr.size()][7];

      for (int j=0; j<arr.size(); j++){
      	Astheneis p = arr.get(j);
      	data[j][0] = p.getOnoma();
      	data[j][1] = p.getEpwnimo();
      	data[j][2] = ""+p.getIdAstheneis();
      	data[j][3] = p.getTilefwno();
      	data[j][4] = p.getDiefthinsi();
      	data[j][5] = p.getEmail();
      	SiggenisAstheni sig = siggenis.findByKodikosArrostou(p.getIdAstheneis());
      	data[j][6] = sig.getOnomaSiggeni() + " \n\n " + sig.getTiliefonoSiggeni();
      }
      
      final JTable table = new JTable(data, categories);
      JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
      TableColumn emfanistike = table.getColumnModel().getColumn(2);
      JComboBox comboBox = new JComboBox();
      comboBox.addItem("Snowboarding");
      comboBox.addItem("Rowing");
      comboBox.addItem("Chasing toddlers");
      comboBox.addItem("Speed reading");
      comboBox.addItem("Teaching high school");
      comboBox.addItem("None");
      emfanistike.setCellEditor(new DefaultCellEditor(comboBox));
      frame.getContentPane().setLayout(new BorderLayout());
      frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
      frame.setSize(1200, 550);
      frame.setVisible(true);
      frame.addWindowListener(new WindowAdapter()
		  {
		      @Override
		      public void windowClosing(WindowEvent e)
		      {
		          System.out.println("Closed");
		          TableColumn emfanistike = table.getColumnModel().getColumn(2);
		          System.out.println(emfanistike.toString());
		          System.out.println(table.getValueAt(0, 2));

		          e.getWindow().dispose();
		      }
		  });
	  
  }


  
}