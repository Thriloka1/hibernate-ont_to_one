package org.jsp.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.controllers.Person;

public class SavePerson {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p=new Person();
		p.setName("rohit");
		p.setMail("rohit@gmail.com");
		p.setPassword("rohit123");
		
		et.begin();
		em.persist(p);
		et.commit();
		em.close();
		System.out.println(p);
		
	}
}
