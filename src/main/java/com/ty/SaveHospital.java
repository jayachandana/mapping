package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital hospital=new Hospital();
		hospital.setName("Nimans");
		hospital.setWebsite("nimans@gmail.com");
		
		Branch branch1=new Branch();
		branch1.setLocation("banglore");
		branch1.setCity("whitefield");
		branch1.setPhone(45678);
		branch1.setHospital(hospital);
		
		Branch branch2=new Branch();
		branch2.setLocation("hyd");
		branch2.setCity("madhapur");
		branch2.setPhone(45678);
		branch2.setHospital(hospital);
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		et.commit();
		
	}

}
