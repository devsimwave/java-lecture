package com.greedy.section01.object.run;

import com.greedy.section01.object.book.model.vo.BookVO;

public class Application2 {

	public static void main(String[] args) {

		/* equals() 메소드 오버라이딩
		 * 인스턴스의 동일성을 판단하여 boolean값을 반환해준다.
		 * 인스턴스의 주소와 값이 같은지 판단해준다.*/
		
		BookVO book1 = new BookVO(1, "홍길동전", "허균", 500000);
		BookVO book2 = new BookVO(1, "홍길동전", "허균", 500000);
		
		//레퍼런스 변수는 stack에 주소값을 갖고 있기 때문에 생성자에 동일한 정보를 갖고 있긴하지만 각각 서로 다른 객체의 주소값을 갖고 있기 때문에 값은 false가 나온다.
		System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));	
		System.out.println("두 인스턴스의 equals() 비교 : " + (book1.equals(book2)));		// 
		
		// 변수명만 다르고 같은 객체를 생성하면 주소값은 같고 stack 공간에 할당된 변수만 다르다??
		
		
	}

}
 