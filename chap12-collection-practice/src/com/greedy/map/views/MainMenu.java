package com.greedy.map.views;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.list.controller.BookController;
import com.greedy.list.model.dto.BookDTO;

public class MainMenu {
	
//public void displayMainMenu() {
//		
//		BookController bc = new BookController();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		do {
//			
//			System.out.println("======= 도서 관리 프로그램 =======");
//			System.out.println("1. 도서 등록");
//			System.out.println("2. 도서 전체 조회");
//			System.out.println("3. 도서 번호로 조회");
//			System.out.println("4. 도서 정보 수정");
//			System.out.println("5. 도서 정보 삭제");
//			System.out.println("9. 프로그램 종료");
//			System.out.print("메뉴 번호 입력 :");
//			
//			int no = sc.nextInt();
//			switch(no) {
//				case 1 : bc.insertNewBook(inputBookInfo()); break;
//				case 2 : bc.selectAllBooks(); break;
//				case 3 : bc.selectBook(inputBookNumber("search")); break;
//				case 4 : bc.updateBook(inputBookNumber("update"), inputBookInfo()); break;
//				case 5 : bc.deleteBook(inputBookNumber("delete")); break;
//				case 9 : System.out.println("프로그램을 종료합니다."); return;
//				default : break;
//			}
//			
//		} while(true);
//		
//	}
//
//	private Map<String, Object> inputBookInfo() {
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("도서 번호를 입력하세요 : ");
//		int number = sc.nextInt();
//		sc.nextLine();
//		System.out.print("도서명을 입력하세요 : ");
//		String title = sc.nextLine();
//		System.out.print("작가를 입력하세요 : ");
//		String author = sc.nextLine();
//		System.out.print("가격을 입력하세요 : ");
//		int price = sc.nextInt();
//		
//		Map<String, Object> book = new HashMap<>();
//		book.put("number", number);
//		book.put("title", title);
//		book.put("author", author);
//		book.put("price", price);
//		
//		
//		
//		return book;
//	}
//	
//		private int inputBookNumber(String code) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		switch(code) {
//			case "search" : System.out.print("검색하실 도서 번호를 입력하세요 : "); break;
//			case "update" : System.out.print("수정하실 도서 번호를 입력하세요 : "); break;
//			case "delete" : System.out.print("삭제하실 도서 번호를 입력하세요 : "); break;
//		}
//		
//		int number = sc.nextInt();
//		
//		return number;
//	}
}
