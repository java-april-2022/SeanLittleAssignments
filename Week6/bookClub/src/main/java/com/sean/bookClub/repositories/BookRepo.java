package com.sean.bookClub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sean.bookClub.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
	List<Book> findAll();
	
}

