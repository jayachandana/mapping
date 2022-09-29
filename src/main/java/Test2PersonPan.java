import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test2PersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		Person person=em.find(Person.class, 2);
		System.out.println("-------person info--------");
		System.out.println("Id is :"+person.getId());
		System.out.println("name is :"+person.getName());
		System.out.println("Gender is : "+person.getGender());
				
		Pan pan=person.getPan();
		if(pan!=null) {
			System.out.println("---------pan info---------");
			System.out.println("pan id is :"+pan.getId());
			System.out.println("pan number is :"+pan.getNumber());
			System.out.println("pan type is :"+pan.getType());
			
		}
	}

}
