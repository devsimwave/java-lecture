package com.greedy.map.controller;

import java.util.List;

import com.greedy.list.model.dto.BookDTO;
import com.greedy.list.model.service.BookService;
import com.greedy.list.views.ResultView;

public class BookController {
	
//	public void insertNewBook(BookDTO book) {
//
//		BookService bookService = new BookService();
//		boolean isSuccess = bookService.insertNewBook(book);
//
//		ResultView rv = new ResultView();
//		if (isSuccess) {
//			rv.successMessage("insert");
//		} else {
//			rv.failedMessage("insert");
//		}
//
//	}
//
//	public void selectAllBooks() {
//
//		List<BookDTO> bookList = new BookService().selectAllBooks();
//
//		ResultView rv = new ResultView();
//		rv.displayBookList(bookList);
//
//	}
//
//	public void selectBook(int bookNumber) {
//
//		BookDTO book = new BookService().searchBookBy(bookNumber);
//
//		ResultView rv = new ResultView();
//		if (book != null) {
//			rv.displayBook(book);
//		} else {
//			rv.displayNoSearchResult();
//		}
//
//	}
//
//	public void updateBook(int bookNumber, BookDTO bookInfo) {
//
//		boolean isSuccess = new BookService().updateBookInfo(bookNumber, bookInfo);
//
//		ResultView rv = new ResultView();
//		if (isSuccess) {
//			rv.successMessage("update");
//		} else {
//			rv.failedMessage("update");
//		}
//	}
//
//	public void deleteBook(int bookNumber) {
//
//		boolean isSuccess = new BookService().deleteBook(bookNumber);
//
//		ResultView rv = new ResultView();
//		if (isSuccess) {
//			rv.successMessage("delete");
//		} else {
//			rv.failedMessage("delete");
//		}
//	}
}
