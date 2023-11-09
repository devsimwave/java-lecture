package com.greedy.list.model.service;

import java.util.List;

import com.greedy.list.model.dao.BookDAO;
import com.greedy.list.model.dto.BookDTO;

public class BookService {

	public boolean insertNewBook(BookDTO book) {
		
		BookDAO bookDAO = new BookDAO();
		int result = bookDAO.insertBook(book);
		
		return result > 0? true : false;
	}

	public List<BookDTO> selectAllBooks() {

		List<BookDTO> bookList = new BookDAO().selectAllBooks();
		
		return bookList;
	}

	public BookDTO searchBookBy(int bookNumber) {

		return new BookDAO().searchBookBy(bookNumber);
		
	}


	
}
