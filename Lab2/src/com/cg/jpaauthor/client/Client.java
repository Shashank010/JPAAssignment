package com.cg.jpaauthor.client;

import com.cg.jpaauthor.entities.Author;
import com.cg.jpaauthor.service.AuthorService;
import com.cg.jpaauthor.service.AuthorServiceImpl;




public class Client {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
				AuthorService service = new AuthorServiceImpl();
				
				Author author = new Author();
				author.setAuthorid(100);
				author.setFirstname("Sushant");
				author.setMiddlename("H");
				author.setLastname("Gadekar");
				author.setPhoneno(997156540L);
				service.addAuthor(author);
				
				//at this breakpoint, we have added one record to table
				author = service.getAuthorById(100);
				System.out.print("ID:"+author.getAuthorid());
				System.out.println(" FirstName:"+author.getFirstname());
				
				author.setFirstname("Prashant");
				service.updateAuthor(author);
				
				//at this breakpoint, we have updated record added in first section
				author = service.getAuthorById(100);
				System.out.print("ID:"+author.getAuthorid());
				System.out.println(" FirstName:"+author.getFirstname());
				
				//at this breakpoint, record is removed from table
				service.removeAuthor(author);
				System.out.println("End of program...");

				
				
				
	}

}
