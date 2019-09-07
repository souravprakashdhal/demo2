package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.*;
import com.example.exception.BookNotFoundException;

@RestController
public class BooksServices {
	
	
	@GetMapping("/books")
	public List<Books> getAllBooks() {
	
		List<Books> li = BookServicesDAO.getAllBooks();
		
		return li;
		
	}
	
	@GetMapping("/books/{id}")
	
	public Books getBookbyId(@PathVariable int id)
	{
		Books books=BookServicesDAO.getBooksByID(id);
		return books;
	}
	
	@PostMapping("/addBooks")
	public void addBookId(@RequestBody Books books) 
	{
		BookServicesDAO.addBooks(books);
		
		
	}

}
