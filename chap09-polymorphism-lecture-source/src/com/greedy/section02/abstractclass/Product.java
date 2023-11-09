package com.greedy.section02.abstractclass;

public abstract class Product { 			//abstract메소드가 있으면 클래스에도 반드시 abstract를 써줘야 한다.
	
	/* 추상클래스는 필드를 가질 수 있다.*/
	private int nonStaticField;				//abtsract 키워드를 사용하는 이유는 오버라이딩을 강제화 하기 위해서 사용한다
	private static int staticField;
	
	/* 추상클래스는 생성자도 가질 수 있다.
	 * 하지만 직접적으로 인스턴스를 생성할 수는 없다.
	 * */
	public Product() {
		System.out.println("Product 클래스의 기본 생성자 호출됨...");
	}
	
	/* 추상클래스는 일반적인 메소드도 가질 수 있다.*/
	public void nonStaticMethod() {
		System.out.println("Product 클래스의 nonStaticMethod 호출됨...");
	}
	
	public static void staticMethod() {
		System.out.println("Product 클래스의 staticMethod 호출함...");
	}
	
	public abstract void abstmethod();		//메소드 뒤에 콜론이 있는 메소드는 추상메소드인데 접근제한자 리턴값 사이에 abstract를 키워드를 넣어줘야한다.
	
}
