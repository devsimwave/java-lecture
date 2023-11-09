package com.greedy.section03.interfaceimplements;

public class Application {

	public static void main(String[] args) {

		/* 인터페이스
		 * 추상메소드와 상수 필드(public static final)만 가질 수 있는 클래스의 변형체이다.
		 * */
		
		/* 인터페이스는 인스턴스를 생성할 수없다.*/
//		InterProduct interproduct = new InterProduct();
		
		/* 레퍼런스 타입으로만 사용이 가능하다.*/
		InterProduct interProduct = new Product();
		
		interProduct.nonStaticMethod();
		interProduct.abstMethod();
		
		interProduct.defaultMethod();
	
		/* static 메소드의 접근은인터페이스명.메소드명(); 으로 접근한다.*/
		InterProduct.staticMethod();
	
		/* 상수 필드 접근도 인터페이스명.필드명으로 접근함*/
		System.out.println(InterProduct.MAX_NUM);
		System.out.println(InterProduct.MIN_NUM);
	}	

}
