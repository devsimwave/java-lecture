package com.greedy.list.model.dao;

import java.sql.DatabaseMetaData;
import java.util.List;

import com.greedy.list.model.dto.BookDTO;

public class BookDAO {

	public int insertBook(BookDTO book) {
		
		int bookListSize = BookDataBase.bookLIst.size();
		BookDataBase.bookLIst.add(book);
		
		return BookDataBase.bookLIst.size() - bookListSize;
	}

	public List<BookDTO> selectAllBooks() {

		return BookDataBase.bookLIst;
	}

	public BookDTO searchBookBy(int bookNumber) {
		
		List<BookDTO> bookList = BookDataBase.bookLIst;
		
		BookDTO selectedBook = null;
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getNumber() == bookNumber) {
				selectedBook = bookList.get(i);
			}
		}
		
		return selectedBook;
	}


}
