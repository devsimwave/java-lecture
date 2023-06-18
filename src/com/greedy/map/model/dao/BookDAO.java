package com.greedy.map.model.dao;

import java.util.List;

import com.greedy.list.model.dao.BookDataBase;
import com.greedy.list.model.dto.BookDTO;

public class BookDAO {
	
//public int insertBook(BookDTO book) {
//		
//		int bookListSize = BookDataBase.bookList.size();
//		BookDataBase.bookList.add(book);
//		
//		return BookDataBase.bookList.size() - bookListSize;
//	}
//
//	public List<BookDTO> selectAllBooks() {
//		
//		return BookDataBase.bookList;
//	}
//
//	public BookDTO searchBookBy(int bookNumber) {
//		
//		List<BookDTO> bookList = BookDataBase.bookList;
//		
//		BookDTO selectedBook = null;
//		for(int i = 0; i < bookList.size(); i++) {
//			if(bookList.get(i).getNumber() == bookNumber) {
//				selectedBook = bookList.get(i);
//			}
//		}
//		
//		return selectedBook;
//	}
//
//	public int updateBookInfo(int bookNumber, BookDTO bookInfo) {
//		
//		List<BookDTO> bookList = BookDataBase.bookList;
//		int result = 0;
//		
//		for(int i = 0; i < bookList.size(); i++) {
//			if(bookList.get(i).getNumber() == bookNumber) {
//				bookList.set(i, bookInfo);
//				result++;
//			}
//		}
//		
//		return result;
//	}
//
//	public int deleteBook(int bookNumber) {
//		
//		List<BookDTO> bookList = BookDataBase.bookList;
//		int result = 0;
//		
//		for(int i = 0; i < bookList.size(); i++) {
//			if(bookList.get(i).getNumber() == bookNumber) {
//				bookList.remove(i);
//				result++;
//			}
//		}
//		
//		return result;
//	}
}
