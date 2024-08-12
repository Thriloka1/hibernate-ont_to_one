package org.jsp.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.controllers.PanCard;

public class FetchPanCard {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
	
		PanCard pc = em.find(PanCard.class, 1);
		
		System.out.println(pc.getId()+" "+pc.getPcid()+" "+pc.getPwd());
	
	
	}
}
