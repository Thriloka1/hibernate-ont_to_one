package org.jsp.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.controllers.PanCard;
import org.jsp.controllers.Person;

public class RemovePanCardById {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
		int pid=4;
		
		PanCard pc = em.find(PanCard.class, pid);
		Query q = em.createQuery("from Person");
		List<Person> rl = q.getResultList();
		
		for(Person p:rl) {
			if(p.getPc().getId()==pid) {
				p.setPc(null);
				et.begin();
				em.merge(p);
				
				
			}
		}
		
		System.out.println(pc); 
		em.remove(pc);
		et.commit();
		em.close();
		
	}
}
