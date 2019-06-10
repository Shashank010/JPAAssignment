package com.cg.author.client;

import com.cg.author.entities.Author;
import com.cg.author.service.AuthorService;
import com.cg.author.service.AuthorServiceImpl;


public class Client {

	public static void main(String[] args) {

		
		
				AuthorService service = new AuthorServiceImpl();
				
				Author author = new Author();
				author.setAuthorId(100);
				author.setFirstName("Shashank");
				author.setMiddleName("Sanjay");
				author.setLastName("Mhatre");
				author.setPhoneNo(9029);
				service.addAuthor(author);
				
				
				author = service.findAuthorById(100);
				System.out.print("ID:"+author.getAuthorId());
				System.out.println(" FirstName:"+author.getFirstName());
				
				author.setFirstName("Abhi");
				service.updateAuthor(author);
				
				
				author = service.findAuthorById(100);
				System.out.print("ID:"+author.getAuthorId());
				System.out.println(" FirstName:"+author.getFirstName());
				
				
				service.removeAuthor(author);
				System.out.println("End of program...");

				
				
				
	}

}
