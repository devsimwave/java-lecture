package com.greedy.section01.object.run;

import com.greedy.section01.object.book.model.vo.BookVO;

public class Application3 {

	public static void main(String[] args) {

		/* Object 클래스의 명세에 작성된 일반 규약에 따르면
		 * equals() 메소드를 재정의 하는 경우 반드시  hashCode() 메소드도 재정의 하도록 되어있다.*/
		
		/* 동등객체 생성*/
		BookVO book1 = new BookVO(1, "홍길동전", "허균", 500000);
		BookVO book2 = new BookVO(1, "홍길동전", "허균", 500000);
		
		System.out.println("book1의 hashCode : " + book1.hashCode());
		System.out.println("book2의 hashCode : " + book2.hashCode());
		
		
		
	}

}
