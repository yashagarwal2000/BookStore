package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.model.BookStore;
import com.bookstore.service.BookServiceImpl;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@GetMapping()
	public ResponseEntity<List<BookStore>> getAllBooks(){
		return (ResponseEntity<List<BookStore>>) bookServiceImpl.getAllBooks();
	}
	@GetMapping("/{Id}")
	public ResponseEntity<BookStore> getBookById(@PathVariable Long id){
		return bookServiceImpl.getBookById(id);
	}
//	@GetMapping("/bookname/{bookName}")
//	public ResponseEntity<BookStore> getBookByName(@PathVariable String bookName){
//		return bookServiceImpl.getBookByName(bookName);
//	}
	@PostMapping()
	public ResponseEntity<String> createBook(@RequestBody BookStore bookStore){
		return bookServiceImpl.createBook(bookStore);
	}
	@PutMapping("/{id}")
	public ResponseEntity<BookStore> updateBook(@PathVariable Long id,@RequestBody BookStore bookStore){
		return bookServiceImpl.updateBook(id, bookStore);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteBook(@PathVariable Long id){
		return bookServiceImpl.deleteBook(id);
	}
	
}
