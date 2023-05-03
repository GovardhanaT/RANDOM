package com.bookdetails.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookdetails.app.Models.Book;
import com.bookdetails.app.Repository.BookRepo;
import com.bookdetails.app.Service.BookService;

public class ApiCoontroller
{@Autowired
	public BookService re;
	@GetMapping("/get")
	public List<Book>  getBooks(){
       return re.getBookList() ;
	}
}
