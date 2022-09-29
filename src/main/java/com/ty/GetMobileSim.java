package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		
		Sim sims=em.find(Sim.class, 1);
		
		System.out.println("====Sim details=====");
		System.out.println("sim id:"+sims.getId());
		System.out.println("sim name:"+sims.getName());
		System.out.println("sim provider:"+sims.getProvider());
		
		Mobile mobile=sims.getMobile();
		
		System.out.println("====mobile details=====");
		System.out.println("mobile id:"+mobile.getId());
		System.out.println("mobile name:"+mobile.getName());
		System.out.println("mobile cost:"+mobile.getCost());
		
		
	}

}
