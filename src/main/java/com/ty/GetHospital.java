package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Branch branch=em.find(Branch.class, 1);
		if(branch!=null) {
		System.out.println("====branch details");
		System.out.println("branch id"+branch.getId());
		System.out.println("branch location:"+branch.getLocation());
		System.out.println("branch city :"+branch.getCity());
		System.out.println("branch phone:"+branch.getPhone());
		
		
		Hospital hospital=branch.getHospital();
		System.out.println("hospital id:"+hospital.getId());
		System.out.println("hospital name:"+hospital.getName());
		System.out.println("hospital website :"+hospital.getWebsite());
		
		}else
			System.out.println("invalid data");
	}

}
