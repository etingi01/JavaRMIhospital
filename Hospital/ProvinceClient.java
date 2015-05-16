
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.ArrayList;
 
/**
 * ProvinceClient: client application
 * @author http://lycog.com
 */
public class ProvinceClient {
 
  public static void main(String[] args) {
    try {
      //Get reference to rmi registry server
    	//System.setProperty("java.rmi.server.hostname","127.0.0.1");
      Registry registry = LocateRegistry.getRegistry("127.0.0.1");

      //Lookup server object
      IRemoteProvince rp = (IRemoteProvince) registry.lookup("Province");
      System.out.println("astheneis lookup");
      IRemoteAstheneis as = (IRemoteAstheneis) registry.lookup("Astheneis");
      IRemoteAstheneisAllergies al = (IRemoteAstheneisAllergies) registry.lookup("AstheneisAllergies");
      IRemoteAstheneisTravma at = (IRemoteAstheneisTravma) registry.lookup("AstheneisTravma");
      IRemoteComments com = (IRemoteComments) registry.lookup("comments");
      IRemoteWarnings warn= (IRemoteWarnings) registry.lookup("warnings");
      /*  registry.rebind("risk", ris);
      registry.rebind("eidiYpallilwn", eidi);
      registry.rebind("istoriko", istor);
      registry.rebind("patientAstheneies", patasth);
      registry.rebind("siggeneis", sig);
      registry.rebind("therapeia", ther);
      registry.rebind("therapeiaAstheneies", therasth);
      registry.rebind("consult", cons);
      registry.rebind("typeAstheneias", type);*/
      IRemoteRisk risk = (IRemoteRisk) registry.lookup("risk");
      IRemoteEidiIpallilwn eidiYpal = (IRemoteEidiIpallilwn) registry.lookup("eidiYpallilwn");
      IRemoteIstorikoTherapeias istoriko = (IRemoteIstorikoTherapeias) registry.lookup("istoriko");
      IRemotePatientAstheneies patientAsth = (IRemotePatientAstheneies) registry.lookup("patientAstheneies");
      IRemoteSiggenisAstheni siggenis = (IRemoteSiggenisAstheni) registry.lookup("siggeneis");
      IRemoteTherapeia therapeia = (IRemoteTherapeia) registry.lookup("therapeia");
      IRemoteTherapeiesAstheneies therapeiesAstheneies = (IRemoteTherapeiesAstheneies) registry.lookup("therapeiaAstheneies");
      IRemoteConsultation consultation = (IRemoteConsultation) registry.lookup("consult");
      IRemoteTypeAstheneias typeAsth = (IRemoteTypeAstheneias) registry.lookup("typeAstheneias");
     
      
      
      //Save province
      Province bmc = new Province(8282, "rlouka01", "Rafaellita", "Louka", "99394781" , "rafkiola@gmail.com", 2);
      System.out.println("Saving provinces...");
      //rp.save(bmc);
      Province login = rp.findByUsername("antonis");
      System.out.println(login.toString());
      
      Astheneis as1 = as.findById(1);      
      System.out.println(as1.toString());
    
      ArrayList<AstheneisAllergies> al1 = al.findByKodikosPatient(2);
      for (int j=0; j<al1.size(); j++){  
    	  System.out.println(al1.get(j).toString());
      }
      AstheneisTravma at1 = at.findByCodeTravma(1);
      System.out.println(at1.toString());
      
      comments comment = com.findByDoctorPatient(1, "antonis");
      System.out.println(comment.toString());
      
      ArrayList<Warnings> warning = warn.findByKodArrostou(1);
      for (int j=0; j<warning.size(); j++){  
          System.out.println(warning.get(j).toString());
      }
      
      ArrayList<Risk> rsk = risk.findByCodeArrostos(1);
      for (int j=0; j<rsk.size(); j++){  
          System.out.println(rsk.get(j).toString());
      } 

      ArrayList<EidiIpallilwn> eidiIpallilwn = eidiYpal.findByCodeEidikotitas(1);
      for (int j=0; j<eidiIpallilwn.size(); j++){  
          System.out.println(eidiIpallilwn.get(j).toString());
      } 

      ArrayList<IstorikoTherapeias> istorikoTherapeias = istoriko.findByCodeTherapeias(1);
      for (int j=0; j<istorikoTherapeias.size(); j++){  
          System.out.println(istorikoTherapeias.get(j).toString());
      } 

      ArrayList<PatientAstheneies> patientAstheneies = patientAsth.findByCodeArrwstias(1);
      for (int j=0; j<patientAstheneies.size(); j++){  
          System.out.println(patientAstheneies.get(j).toString());
      } 
      
      SiggenisAstheni siggenisAstheni = siggenis.findByKodikosArrostou(1);
      System.out.println(siggenisAstheni.toString());
 
      Therapeia ther = therapeia.findByTherapeia(1);
      System.out.println(ther.toString());

      ArrayList<TherapeiesAstheneies> therAstheneies = therapeiesAstheneies.findByAstheneia(1);
      for (int j=0; j<therAstheneies.size(); j++){  
          System.out.println(therAstheneies.get(j).toString());
      } 
      ArrayList<TherapeiesAstheneies> therAstheneies2 = therapeiesAstheneies.findByTherapeia(1);
      for (int j=0; j<therAstheneies2.size(); j++){  
          System.out.println(therAstheneies2.get(j).toString());
      }
      System.out.println("Consultations of Patient 1:");
      
      ArrayList<Consultation> conslt = consultation.findByKodPatient(1);
      System.out.println(conslt.size());
      for (int j=0; j<conslt.size(); j++){  
          System.out.println(conslt.get(j).toString());
      }   
      
      TypeAstheneias typeAstheneias = typeAsth.findByIdTypeAstheneias(1);
      System.out.println(typeAstheneias.toString());      
      
    } catch (Exception e) {
        System.out.println(e);
      }
  }
}