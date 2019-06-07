package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		// first define few books before we place order

		Book book = new Book();
		book.setISBN(15632);
		book.setTitle("shashank");
		book.setPrice(21564);

		author_master author = new author_master();
		author.setId(554);
		author.setName("mhatre");

		author.addBook(book);

		em.persist(author);

		System.out.println("Added author and book details");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}