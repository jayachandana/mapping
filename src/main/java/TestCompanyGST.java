import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCompanyGST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		Company company=new Company();
		company.setName("Next Gen");
		company.setAddress("Whitefield");
		
		GST gst=new GST();
		gst.setNumber("GSTIN98766JAD");
		gst.setStatus("Active");
		gst.setCompany(company);
		et.begin();
		em.persist(company);
		em.persist(gst);
		et.commit();
	}

}
