package com.sopra.test;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.sopra.DAO.ContactDAO;
import com.sopra.DAO.ContactDAOImpl;
import com.sopra.models.Contact;

public class testContactDAO {

	ContactDAO contDAO = new ContactDAOImpl(); 
	Random generate = new Random(); 
	@Test
	public void testFindByID() {
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
		
		Contact cont6 = contDAO.findByID(1); 
		Assert.assertTrue("not found", cont6.equals(cont1)); 
	}

	@Test
	public void testInsert() {
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
		List<Contact> contacts = contDAO.findAll(); 
		
		Assert.assertTrue("Insert failure", contacts.size()>=5);
	}

	@Test
	public void testFindAll() {
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
		List<Contact> contacts = contDAO.findAll(); 
		
		Assert.assertTrue("Insert failure", contacts.size()>=5);
	}

}
