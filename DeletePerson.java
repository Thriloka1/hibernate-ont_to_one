package org.jsp.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.controllers.Person;

public class DeletePerson {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Person p = em.find(Person.class, 2);
		em.remove(p);
		et.begin();
		et.commit();
		em.close();
		
		
	}
}
