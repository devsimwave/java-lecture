package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application3 {

	public static void main(String[] args) {
		
		/* multi-catch
		 * JDK 1.7에서 추가도니 구문으로
		 * 동일한 레벨의 다른 타입의 예외를 하나의  catch 블럭으로 다룰 수 있다.
		 * */
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoney(20000, 10000);
		} catch (NotEnoughMoneyException e) {
			/* 예외 클래스명, 예외 발생 위치, 예외 메세지 등을 stack호출 역순으로
			 * 빨간 글씨를 이용해서 로그 형태로 출력해주는 기능*/
			e.printStackTrace();
		} catch (PriceNegativeException | MoneyNegativeException e) {
			System.out.println(e.getClass().getName() + "발생!");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally 블럭의 내용이 동작함"); 	// 예외처리 상관없이 작동한다.
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	
	}

}
