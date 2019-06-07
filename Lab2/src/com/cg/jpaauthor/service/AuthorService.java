package com.cg.jpaauthor.service;

import java.util.List;

import com.cg.jpaauthor.entities.Author;

public interface AuthorService
{
	public abstract Author  getAuthorById(int id);

	public abstract void addAuthor (Author  author );

	public abstract void removeAuthor (Author  author );

	public abstract void updateAuthor (Author author );
	


}
