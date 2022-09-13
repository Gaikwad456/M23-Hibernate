package com.capgemini.client;


import com.capgemini.entities.Book;
import com.capgemini.services.BookService;
import com.capgemini.services.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		 
		//retrieve with ID
		 System.out.println("The data is updated");
		 System.out.println("Book with ID:101" + service.getBookById(101));
		 
		 //for all books
		 for(Book b:service.getAllBooks())
		 {
			 System.out.println(b);
		 }
		 
		//for total book count
		 System.out.println("Total Books:" + service.getBookCount());
		 
		//for book by author
		 for(Book b:service.getBookByAuthor("Robert Fischer") ) 
		    {
				System.out.println(b);
		    }
		 
		 //for book by range
		  for(Book b:service.getBooksRange(300.00, 600.00) ) 
		    {
				System.out.println(b);
			}
		  //for book by title
		  for(Book b:service.getBookByTitle("Java EE 7: The Big Picture")) {
				System.out.println(b);
			}
		
			
	}

}
