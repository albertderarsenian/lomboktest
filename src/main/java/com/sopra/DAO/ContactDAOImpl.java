package com.sopra.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sopra.models.Contact;

public class ContactDAOImpl implements ContactDAO {
	EntityManager em = Context.getInstance().getEmf().createEntityManager();
	private Logger LOGGER = LogManager.getLogger(ContactDAO.class.getName()); 

	@Override
	public Contact findByID(Integer id) {
		LOGGER.info("We found by ID");
		return em.find(Contact.class, id);
	}

	@Override
	public Contact insert(Contact obj) {
		LOGGER.info("We insert contacts");
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		return obj;
	}

	@Override
	public void update(Contact obj) {
		LOGGER.info("We update contacts");
		Contact cont1 = null;
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	@Override
	public List<Contact> findAll() {
		LOGGER.info("We found ALL contacts");
		Query q = em.createQuery("from Contact");
		return q.getResultList();
	}

	@Override
	public void deleteByID(Integer id) {
		LOGGER.info("We delete contacts");
		Contact cont1 = em.find(Contact.class, id);
		try {
			em.getTransaction().begin();
			if (cont1 != null) {
				em.remove(cont1);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

}
