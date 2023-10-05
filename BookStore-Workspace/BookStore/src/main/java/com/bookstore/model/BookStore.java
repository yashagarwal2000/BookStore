package com.bookstore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;


@Document(collection = "BookStore")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookStore {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String bookName;
	private String authorName;
	private Double amount;
	public BookStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookStore(Long id, String bookName, String authorName, Double amount) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BookStore [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", amount=" + amount
				+ "]";
	}
	
}
