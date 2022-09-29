package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Mobile mobile =new Mobile();
		mobile.setName("oneplus");
		mobile.setCost(32567.0);
		
		Sim sim1=new Sim();
		sim1.setName("Airtel Sim");
		sim1.setProvider("Airtel");
		sim1.setMobile(mobile);

		Sim sim2=new Sim();
		sim2.setName("Jio Sim");
		sim2.setProvider("Jio");
		sim2.setMobile(mobile);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		em.persist(mobile);
		em.persist(sim1);
		em.persist(sim2);
		
		et.commit();
	}

}
