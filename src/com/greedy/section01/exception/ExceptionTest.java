package com.greedy.section01.exception;

public class ExceptionTest {
	
	public void checkEnoughMoney(int price, int money) throws Exception {	// throws는 내가 처리하지 않고 위임하겠다.
		
		System.out.println("가지고 계신 돈은" + money + "원 입니다.");
		
		if(money >= price) {
			System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
		} else {
			/* 예외를 강제로 발생시키는 구문*/
			throw new Exception();  //예외가 발생되면 밑에 구문은 실행되지 않는다.
		}
		
		/* 예외가 발생하지 않는 경우에만 실행됨*/
		System.out.println("즐거운 쇼핑하세요~");
		
	}
	
}
