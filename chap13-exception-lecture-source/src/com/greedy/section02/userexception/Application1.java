package com.greedy.section02.userexception;

import com.greedy.section02.userexception.exception.MoneyNegativeException;
import com.greedy.section02.userexception.exception.NotEnoughMoneyException;
import com.greedy.section02.userexception.exception.PriceNegativeException;

public class Application1 {

	public static void main(String[] args) {
		
		ExceptionTest et = new ExceptionTest();
		
		try {
//			et.checkEnoughMoney(50000, 30000);
//			et.checkEnoughMoney(-50000, 30000);
//			et.checkEnoughMoney(50000, -60000);
			et.checkEnoughMoney(30000, 50000);
			
		} catch (Exception e) {			//다형성이 적용돼 한번에 다 처리할 수 있다.
			e.printStackTrace();
		}
	}

}
