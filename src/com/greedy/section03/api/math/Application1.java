package com.greedy.section03.api.math;

public class Application1 {

	public static void main(String[] args) {

		/*
		 * API란? Application Programming Interface는 응용 프로그램에서 사용할 수 있도록 운영체제나 프로그래밍 언어가
		 * 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다. 쉽게 말 해 우리가 구현할 수 없거나, 구현하기 번거로운 기능들을 JDK를
		 * 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스) 들을 의미한다.
		 */

		/* java.lang.Math //자바에서 유일하게 import를 쓰지 않고 사용할 수 있는 클래스 */
		System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
		System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));

		System.out.println("10과 20 중 더 작은 것은 : " + Math.min(10, 20));
		System.out.println("20과 30 중 더 큰 것은 : " + Math.max(20, 30));

		System.out.println("원주율 : " + Math.PI); 		// 대문자로 되어있음 final 키워드
		
		/* 0.0 ~ 0.99999.... 까지 범위의 난수 발생*/
		System.out.println("난수 발생 : " + Math.random());
		
		
		
	}

}
