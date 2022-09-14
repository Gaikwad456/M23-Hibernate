package com.capgemini.uni.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneBiDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d=new Department();
		d.setId(11234);
		d.setDeptName("Finance");
		
		
		Employee e=new Employee();
		e.setEmpId(34);
		e.setEname("Prisha");
		e.setSalary(35000.50f);
		
		
		Employee e1=new Employee();
		e1.setEmpId(35);
		e1.setEname("Sakshi");
		e1.setSalary(55000.50f);
		
		
		e.setDept(d);
		e1.setDept(d);
		
		em.persist(e);
		em.persist(e1);
		
		System.out.println("Rows is inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();


	}

}