package com.capgemini.uni.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//program on OneToOne Unidirectional
public class OneToOneUniDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(5);
		s.setName("Komal");
		s.setPercentage(83.74f);
		
		Address a=new Address();
		a.setStreetno(99);
		a.setArea("Panchavati");
		a.setCity("Nashik");
		a.setState("Maharashtra");
		
		s.setAddress(a);
		em.persist(s);
		
		System.out.println("Rows is inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();

		
		

	}

}