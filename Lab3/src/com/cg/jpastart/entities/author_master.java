package com.cg.jpastart.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author_master")
public class author_master implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author", joinColumns = { @JoinColumn(name = "auhtor_id") }, inverseJoinColumns = { @JoinColumn(name = "book_id") })
	private Set<Book> book = new HashSet<>(); // required to avoid
												// NullPointerException

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBooks(Set<Book> book) {
		this.book = book;
	}

	public void addBook(Book book) {
		this.getBook().add(book);
	}

}