package org.jsp.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.controllers.Person;

public class FetchPerson {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 1);
		
		System.out.println(p.getId()+" "+p.getName()+" "+p.getMail()+" "+p.getPassword()+" "+p.getPc());
	
	}
}
