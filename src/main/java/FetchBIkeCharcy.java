import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchBIkeCharcy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager em=emf.createEntityManager();
		
		
		Bike bike=em.find(Bike.class, 2);
		System.out.println("-------Bike info--------");
		System.out.println("Id is :"+bike.getId());
		System.out.println("name is :"+bike.getName());
		System.out.println("Gender is : "+bike.getCost());
				
		Charcy charcy=bike.getCharcy();
		if(charcy!=null) {
			System.out.println("---------pan info---------");
			System.out.println("pan id is :"+charcy.getId());
			System.out.println("pan number is :"+charcy.getType());
			
			
		}
	}

}
