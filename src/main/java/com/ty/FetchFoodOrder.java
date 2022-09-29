package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchFoodOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Item items=em.find(Item.class, 1);
		System.out.println("====Food order details=====");
		System.out.println("order id:"+items.getId());
		System.out.println("item name:"+items.getItem_name());
		System.out.println("item quantity :"+items.getQuantity());
		System.out.println("item cost:"+items.getCost());
		FoodOrder foodorder=items.getFoodorder();
		
		System.out.println("====items order details=====");
		System.out.println("order id:"+foodorder.getId());
		System.out.println("order name:"+foodorder.getName());
		System.out.println("order status :"+foodorder.getStatus());
		
	}

}
