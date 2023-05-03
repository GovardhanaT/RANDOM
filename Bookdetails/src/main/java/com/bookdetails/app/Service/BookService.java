package com.bookdetails.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookdetails.app.Models.Book;
import com.bookdetails.app.Repository.BookRepo;

public class BookService{
	@Autowired
	public BookRepo ap;
	public List<Book> getBookList(Book b)
	{
		return ap.save(b); 
	}
}