package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveFoodOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder foodorder=new FoodOrder();
		foodorder.setName("chandana");
		foodorder.setStatus("placed");
		
		Item item1=new Item();
		item1.setItem_name("coke");
		item1.setQuantity(1);
		item1.setCost(20.0);
		item1.setFoodorder(foodorder);
		
		Item item2=new Item();
		item2.setItem_name("burger");
		item2.setQuantity(1);
		item2.setCost(75.0);
		item2.setFoodorder(foodorder);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(foodorder);
		em.persist(item1);
		em.persist(item2);
		et.commit();
	}

}
