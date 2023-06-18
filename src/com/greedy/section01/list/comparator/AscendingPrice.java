package com.greedy.section01.list.comparator;

import java.util.Comparator;

import com.greedy.section01.list.dto.BookDTO;

public class AscendingPrice implements Comparator<BookDTO> {

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		
		/*sort() 애서 내부적으로 사용하는 메소드이다.
		 * 인터페이스를 상속받아서 메소드 오버라이딩 하는것을 강제화 해 놓았다.
		 * */
		
		/* 비교 대상의 두 인스턴스에서 가격이 오름차순으로 정렬되기 위해서는
		 * 앞의 가격이 더 적은 가격이어야 한다.
		 * 만약 뒤의 가격이 더 적은 경우 두 인스턴스의 순서를 바꿔줘야 한다.
		 * 그 때 두 값ㅇ르 바꾸라는 신호를 양수를 리턴하게 되면 정렬 시 순서를 바꾸는 조건으로 사용하게 된다.*/
		
		int result = 0;
		
		if(o1.getPrice() > o2.getPrice()) {
			result = 1;
		} else if(o1.getPrice() < o2.getPrice()) {
			result = -1;
		} else {
			result = 0;
		}
		
		return result;
		
	}
	
}
