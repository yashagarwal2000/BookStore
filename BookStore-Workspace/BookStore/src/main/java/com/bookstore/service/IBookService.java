package com.bookstore.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bookstore.model.BookStore;

@Service
public interface IBookService  {

	List<BookStore> getAllBooks();
	
	ResponseEntity<BookStore> getBookById(Long id);
	
//	ResponseEntity<BookStore> getBookByName(String bookName);
	
	ResponseEntity<String> createBook(BookStore bookStore);
	
	ResponseEntity<BookStore> updateBook(Long id, BookStore updateBook);

	ResponseEntity<Object> deleteBook(Long id);
	
}
