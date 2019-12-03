package com.sopra.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Context {

	private static Context INSTANCE; 
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("lomboktest");
	private Context() {}

	public static Context getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Context();
		} return INSTANCE; 
	}
	public EntityManagerFactory getEmf() {
		return emf; 
	}


}
