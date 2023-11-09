package com.greedy.list.exception;

public class BookException {

	public void checkNumber(int number, int price) 
			throws TitleNegativeException, PriceNegativeException  {
		
		if(number < 0) {
			throw new TitleNegativeException("도서명을 1부터 입력해주세요.");
		}

		if(price < 0) {
			throw new PriceNegativeException("1원 이상의 가격을 입력하세요");
		}
	
	}
	
}
