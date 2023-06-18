package com.greedy.list.views;

import java.util.List;

import com.greedy.list.model.dto.BookDTO;

public class ResultView {

	public void successMessage(String code) {
		switch(code) {
			case "insert" : System.out.println("도서 등록에 성공하셨습니다."); break;
		}
		
	}

	public void failedMessage(String code) {
		switch(code) {
			case "insert" : System.out.println("도서 등록에 실패하셨습니다."); break;
		}
		
	}

	public void displayMenu(List<BookDTO> bookList) {
		
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		
	}

	public void displayBook(BookDTO book) {
		
		System.out.println(book);
		
		
	}

	public void displayNoSearchResult() {
		
		System.out.println("도서 검색 결과가 없습니다.");
		
		
	}

	

	
}
