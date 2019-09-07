package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.entity.Books;
import com.example.exception.BookNotFoundException;

public class BookServicesDAO {

static List<Books> li = new ArrayList<Books>();
	
	static
	{
		li.add(new Books(1, "Mastering Spring 5.2", "Ranga Karanam"));
		li.add(new Books(2, "Mastering Spring 5.2", "Sourav Dhal"));
		li.add(new Books(3, "Mastering Spring 5.2", "Micky"));
	}
	
	public static List<Books> getAllBooks()
	{
		return li;
	}
	
	@ExceptionHandler(BookNotFoundException.class)
	public static Books getBooksByID(int id)
	{
		String flag="N";
		Iterator<Books> it = li.iterator();
		while(it.hasNext())
		{
			Books tmp = it.next();
			if(id == tmp.getId())
			{
				
				return tmp;
				
			}
			
		}
		return null;
	}
	
	public static void addBooks(Books book)
	{
		li.add(book);
	}
}
