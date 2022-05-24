package com.sean.bookClub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.sean.bookClub.models.Book;
import com.sean.bookClub.services.BookService;
import com.sean.bookClub.services.UserService;

@Controller
public class BookController {

	@Autowired
	private UserService userService;

	@Autowired
	private BookService bookService;

	// New book
	@GetMapping("/new")
	public String newBook(HttpSession session, @ModelAttribute("newBook") Book book) {
		if (session.getAttribute("loggedInUser") != null) {
			return "new.jsp";
		} else {
			return "redirect:/";
		}
	}

	// Create book
	@PostMapping("/books/create")
	public String createProject(@Valid @ModelAttribute("newBook") Book book, BindingResult results) {
		if (results.hasErrors()) {
			return "new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/dashboard";
		}
	}

	// Get one book
	@GetMapping("/books/bookDetails/{id}")
	public String bookDetails(@PathVariable Long id, Model bookModel, HttpSession session) {
		if (session.getAttribute("loggedInUser") != null) {
			Book book = bookService.getOneBook(id);
			bookModel.addAttribute("book", book);
			return "bookDetails.jsp";
		} else {
			return "redirect:/";
		}
	}

	// Delete book
	@DeleteMapping("books/delete/{id}")
	public String deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
		return "redirect:/dashboard";
	}
	// Edit book
	@GetMapping("books/edit/{id}")
	public String editStudent(@PathVariable long id, Model bookModel, Model model) {
		Book editBook = bookService.getOneBook(id);
		model.addAttribute("books", bookService.allBooks());
		bookModel.addAttribute("editBook", editBook);
		return "bookEdit.jsp";
	}
	// Update book
	@PutMapping("books/update/{id}")
	public String updateBook(@ModelAttribute("editBook") Book editedBook, @PathVariable long id, BindingResult results) {
		if(results.hasErrors()) {
			return "bookDetails.jsp";
		}
		bookService.updateBook(editedBook);
		return "redirect:/dashboard";
	}
	
}
