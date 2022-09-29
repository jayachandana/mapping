import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		Person person=new Person();
		Pan pan=new Pan();
		person.setName("tushara");
		person.setGender("female");
		//person.setPan(pan);
		pan.setPerson(person);
		
		pan.setNumber("Ap397JD");
		pan.setType("business");
		et.begin();
		em.persist(person);
		em.persist(pan);
		et.commit();
	}

}
