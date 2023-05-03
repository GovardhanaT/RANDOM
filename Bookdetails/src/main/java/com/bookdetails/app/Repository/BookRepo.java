package com.bookdetails.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer>
{
	
}