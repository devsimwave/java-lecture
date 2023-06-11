package com.greedy.section01.object.run;

import com.greedy.section01.object.book.model.vo.BookVO;

public class Application1 {

	public static void main(String[] args) {

		/* Object 클래스의 toString(), equals(), hashCode() 오버라이딩*/
		
		BookVO book1 = new BookVO(1, "홍길동전", "허균", 500000);
		BookVO book2 = new BookVO(2, "목민심서", "정약용", 300000);
		BookVO book3 = new BookVO(2, "목민심서", "정약용", 300000);
		
		System.out.println("book1.toString() : " + book1.toString());	//타입과 16진수숫자가 나온다.
		System.out.println("book2.toString() : " + book2.toString());
		System.out.println("book3.toString() : " + book3.toString());
		
		System.out.println("book1 : " + book1);							// 위에 출력문과 동일한 결과값이 나온다.
		System.out.println("book2 : " + book2);							// 레퍼런스 변수만 넣으면 toString()메소드를 컴파일러가 알아서 넣어준다.
		System.out.println("book3 : " + book3);
		
		
	}

}
