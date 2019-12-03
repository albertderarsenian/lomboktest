package com.sopra;

import java.util.Random;

import com.sopra.DAO.ContactDAO;
import com.sopra.DAO.ContactDAOImpl;
import com.sopra.models.Contact;

public class Entry {
	public static void main(String[] args) {
		ContactDAO contDAO = new ContactDAOImpl(); 
		Random generate = new Random(); 
		Contact cont1 = new Contact("Albert"+generate.nextInt(100), "DER-ARSENIAN");
		Contact cont2 = new Contact("Albert"+generate.nextInt(100), "DER-ARSENIAN");
		Contact cont3 = new Contact("Albert"+generate.nextInt(100), "DER-ARSENIAN");
		Contact cont4 = new Contact("Albert"+generate.nextInt(100), "DER-ARSENIAN");
		Contact cont5 = new Contact("Albert"+generate.nextInt(100), "DER-ARSENIAN");
		
		contDAO.insert(cont1);
		contDAO.insert(cont2);
		contDAO.insert(cont3);
		contDAO.insert(cont4);
		contDAO.insert(cont5);
	}
}
