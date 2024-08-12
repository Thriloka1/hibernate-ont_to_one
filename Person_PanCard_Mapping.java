package org.jsp.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.controllers.PanCard;
import org.jsp.controllers.Person;

public class Person_PanCard_Mapping {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 2);
		PanCard pc = em.find(PanCard.class, 4);
		
		p.setPc(pc);
		
		et.begin();
		em.merge(p);
		et.commit();
		em.close();
		System.out.println(p);
		
		
		
		
	}
}
