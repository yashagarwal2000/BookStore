package com.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bookstore.dao.IBookRepository;
import com.bookstore.model.BookStore;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private IBookRepository bookRepository;

	@Override
	public List<BookStore> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public ResponseEntity<BookStore> getBookById(Long id) {
		Optional<BookStore> bookstore = bookRepository.findById(id);
		if(bookstore.isPresent()) {
			return ResponseEntity.ok(bookstore.get());
		}
		return ResponseEntity.notFound().build();
	}

	@Override
	public ResponseEntity<String> createBook(BookStore bookStore) {
		bookRepository.save(bookStore);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@Override
	public ResponseEntity<BookStore> updateBook(Long id, BookStore updateBook) {
		Optional<BookStore> bookStore = bookRepository.findById(id);
		if(bookStore.isPresent()) {
			updateBook.setId(id);
			bookRepository.save(updateBook);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Object> deleteBook(Long id) {
		Optional<BookStore> bookStore = bookRepository.findById(id);
		if(bookStore.isPresent()) {
			bookRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

//	@Override
//	public ResponseEntity<BookStore> getBookByName(String bookName) {
//		Optional<BookStore> bookStore = bookRepository.findByName(bookName);
//		if(bookStore.isPresent()) {
//			return ResponseEntity.ok(bookStore.get());
//		}
//		return ResponseEntity.notFound().build();
//	}	
	
}
