package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.greedy.section01.list.comparator.AscendingPrice;
import com.greedy.section01.list.dto.BookDTO;

public class Application2 {

public static void main(String[] args) {
		
		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
		
		for(BookDTO book : bookList) {              //왼쪽에 자료형 변수 : 데이터 값이 저장되어 있는 레퍼런스 변수
			System.out.println(book);
		}
		
		/* Comparable 타입을 가지고 있는 경우에만 sort가 가능하다. */
//		Collections.sort(bookList);
		
		bookList.sort(new AscendingPrice());
		
		System.out.println("가격 오름차순 정렬 ====================================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
//		bookList.sort(new DescendingPrice());
		/* 익명(Anonymous) 클래스 이용하는 방법
		 * 재사용을 목적으로 하게 되면 클래스를 따로 작성해 두고 사용할 수 있지만,
		 * 재상요을 고려하지 않고 바로 익명클래스를 만들어서 사용할 수 있다.
		 * */
		
		bookList.sort(new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				int result = 0;
				if(o1.getPrice() < o2.getPrice()) {
					result = 1;
				} else if(o1.getPrice() > o2.getPrice()) {
					result = -1;
				} else {
					result = 0;
				}
				return result;
			}	
		});
		
		System.out.println("가격 내림차순 정렬 ====================================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 책 제목 오름차순 정렬*/
		bookList.sort(new Comparator<BookDTO>() {
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				
				/* 문자열 자체로는 대소비교가 불가능하다.
				 * 문자 배열로 변경 후 인덱스 하나하나를 비교해서 어느 것이 더 큰 값인지 확인해야 한다.
				 * String 클래스의  compareTo() 메소드에서 이미 해당 기능을 정의해 두었다.
				 * */
				
				/* 앞에 값이 더 작은 경우(즉, 바꾸지 않아도 되는 경우) 음수 반환,
				 * 같으면 0 반환,
				 * 앞에 값이 더 큰 경우 양수 반환 (즉, 바꿔야 하는 경우)
				 * */
				
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
	
		System.out.println("책 이름 오름 차순 정렬 =====================================");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 책 이름 내림차순 정렬
		 * 람다식 JDK 1.8부터 제공
		 * 인터페이스 내의 미완성 메소드가 한 개만 존재하는 경우에만 사용 가능하다.
		 * (매개변수 선언부) -> 로직 
		 * 형태로 작성한다.
		 * */
		bookList.sort((BookDTO o1, BookDTO o2) -> o2.getTitle().compareTo(o1.getTitle()));
	
		 System.out.println("책 이름 내림차순 정렬 =====================================");
		 for(BookDTO book : bookList) {
			 System.out.println(book);
		 }
		 
	}

}
