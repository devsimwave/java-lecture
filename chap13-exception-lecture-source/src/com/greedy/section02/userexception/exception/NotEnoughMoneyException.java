package com.greedy.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception{ 		//사용자 정의의 예외클래스
	
	public NotEnoughMoneyException() {}
	
	public NotEnoughMoneyException(String message) {
		super(message);
	}

	
	
}
