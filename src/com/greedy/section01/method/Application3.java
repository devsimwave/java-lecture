package com.greedy.section01.method;

public class Application3 {

	public static void main(String[] args) {	//args는 argument(인자)

		/* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
		 * 전달인자는 값 매개변수는 공간
		 * 변수의 종류
		 * 1. 우리가 전에 배웠던 변수는 지역변수 (메소드 내에 선언한 변수를 지역변수라 부른다. 영어로 scope)
		 * 2. 매개변수 (오늘 배울거) 메소드 호출괄호에 값을 써주고 메소드 오른쪽에 변수를 넣는다? **** 공부하기!!!!!!
		 * 3. 전역변수(필드)
		 * 4. 클래스(static) 변수(정적 필드)
		 * */
		
		Application3 app3 = new Application3();
		/* 1. 전달 인자로 값 전달 테스트
		 * 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과, 갯수, 순서가 일치하게 값을 넣어 호출해야 한다.
		 * */
		app3.testMethod(20); 			// 인자 (argument)
//		app3.testMethod("40");			// 매개변수는 int형이지만 인자가 String 형이기 때문에 호출할 수 없음
//		app3.testMethod(20, 30, 40);	// 매개변수는 int형 1개 이지만 인자는 3개이기 때문에 호출할 수 없다.
//		app3.testMethod("홍길동, 20");	// 인자와 매개변수 타입의 순서도 맞아야함.
		
		/* 2. 변수에 저장한 값 전달 테스트
		 * 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있다.*/
		int age = 20;
		app3.testMethod(age);
		
		/* 2-2. 자동 형변환을 이용하여 값 전달을 할 수 있다.*/
		byte byteAge = 10;
		app3.testMethod(byteAge); 
		
		/* 2-3. 강제 형변환을 이용해서 값 전달을 할 수 있다.*/
		long longAge = 80;
		app3.testMethod((int) longAge);	// 강제 형변환을 이용하여 자료형을 맞춘 후 호출 가능. (데이터 손실 유의)
		
		/* 2-4. 연산 결과를 이용해서 값 전달을 할 수 있다.*/
		app3.testMethod(age * 3); 		
		
	}

	public void testMethod(int age) {	//매개변수 (parameter)
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}


}
