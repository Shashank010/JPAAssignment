package com.cg.jpaauthor.service;

import com.cg.jpaauthor.dao.AuthorDao;
import com.cg.jpaauthor.dao.AuthorDaoImpl;
import com.cg.jpaauthor.entities.Author;



public class AuthorServiceImpl implements AuthorService{
	
	private AuthorDao dao;

	public AuthorServiceImpl() 
	{
		dao = new AuthorDaoImpl();
		
	}

	@Override
	public Author getAuthorById(int id) 
	{
		Author author  = dao.getAuthorById(id);
		return author;
	}

	@Override
	public void addAuthor(Author author)
	{
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public void removeAuthor(Author author)
	{
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();	
		
	}

	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
		
	}

	
		
	

	


	

	
	

}
