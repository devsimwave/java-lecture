package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application2 {

	public static void main(String[] args) {

		ExceptionTest et = new ExceptionTest();
		
		try {
			
			et.checkEnoughMoney(40000, 30000);
	
		} catch (PriceNegativeException e) {					//여기다 exception 넣어버리면 밑에 코드는 의미가 없어지게 된다. 이유는 모든 exception은 exception을 상속받았기 때문
			System.out.println(e.getClass().getName()); 		// 발생한 예외클래스의 이름을 가져온다라고 이해하자
			System.out.println(e.getMessage());
		} catch (MoneyNegativeException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		} catch (NotEnoughMoneyException e) {					// 모든 exception들이 처리되고 나머지를 처리할 때 간편하게 사용함
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally 블럭의 내용이 동작함");	
		}
	
		System.out.println("프로그램을 종료합니다.");
	
	}

}
