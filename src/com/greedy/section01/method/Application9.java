package com.greedy.section01.method;


public class Application9 {

	public static void main(String[] args) {

		int first = 100;
		int second = 50;
		
		/* 1. non-static 메소드 호출
		 * 클래스가 다르더라도 사용하는 방법은 동일하다
		 * 클래스명 변수명 = new 클래스명();
		 * 변수명.메소드명();
		 * */
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(first, second);
		
		System.out.println("두 수 중 최소값은 : " + min);
		
		/* 2. static 메소드 호출
		 * 클래스명.메소드명(); 
		 * */
		int max = Calculator.maxNumberOf(first, second);
		
		System.out.println("두 수 중 최대값은 : " + max);
		
		/* 가능하긴 하나 권장되지는 않음*/
		int max2 = calc.maxNumberOf(first, second);
		
		System.out.println("두 수 중 더 큰 값은 : " + max);
	
		System.out.println(Math.abs(-10));	 	//abs는 absolute의 약자 Math는 외부에 있는 클래스
		
	}

}
