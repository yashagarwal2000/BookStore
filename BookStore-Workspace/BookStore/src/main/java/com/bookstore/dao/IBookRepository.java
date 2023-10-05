package com.bookstore.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.model.BookStore;
@Repository
public interface IBookRepository extends MongoRepository<BookStore, Long>{

//	Optional<BookStore> findByName(String bookName);
	
}
