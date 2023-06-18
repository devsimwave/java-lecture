package com.greedy.list.controller;

import java.util.List;

import com.greedy.list.model.dto.BookDTO;
import com.greedy.list.model.service.BookService;
import com.greedy.list.views.ResultView;

public class BookController {

	public void insertNewBook(BookDTO book) {
		
		BookService bookService = new BookService();
		boolean isSuccess = bookService.insertNewBook(book);
		
		ResultView rv = new ResultView();
		if(isSuccess) {
			rv.successMessage("insert");
		} else {
			rv.failedMessage("insert");
		}
		
	}

	public void selectAllBooks() {
		
		List<BookDTO> bookList = new BookService().selectAllBooks();
		
		ResultView rv = new ResultView();
		
		rv.displayMenu(bookList);
		
		
	}

	public void selectBooks(int bookNumber) {
		
		BookDTO book = new BookService().searchBookBy(bookNumber);
		
		ResultView rv = new ResultView();
		if(book != null) {
			rv.displayBook(book);
		} else {
			rv.displayNoSearchResult();
		}
		
	}



}
