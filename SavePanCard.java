package org.jsp.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.controllers.PanCard;

public class SavePanCard {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		PanCard pc=new PanCard();
		pc.setPcid("ranifljcqwn");
		pc.setPwd("ranidhf123");
		
		et.begin();
		em.persist(pc);
		et.commit();
		em.close();
		System.out.println(pc);
		
	}
}
