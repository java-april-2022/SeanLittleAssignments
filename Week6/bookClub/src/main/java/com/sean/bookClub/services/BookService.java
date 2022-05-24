package com.sean.bookClub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.bookClub.models.Book;
import com.sean.bookClub.repositories.BookRepo;
import com.sean.bookClub.repositories.UserRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	//List all books
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
	//Create new book
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	//Delete a book
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
	//Get one book details
	public Book getOneBook(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	//Update book
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
}