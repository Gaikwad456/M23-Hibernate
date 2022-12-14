package com.capgemini.dao;

import java.util.List;
import com.capgemini.entities.Book;


public interface BookDao 
{
    public abstract Book getBookById(Integer id);
    public abstract List<Book> getBookByTitle(String title);
    public abstract long getBookCount();
    public abstract List<Book> getBookByAuthor(String author);
    public abstract List<Book> getAllBooks();
    public abstract List<Book> getBooksRange(Double low , Double high);
    
}
