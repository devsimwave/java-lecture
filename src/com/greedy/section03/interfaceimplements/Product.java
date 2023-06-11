
package com.greedy.section03.interfaceimplements;

public class Product extends java.lang.Object implements InterProduct, java.io.Serializable {

	@Override
	public void nonStaticMethod() {
		System.out.println("InterProduct의 nonStaticMethod 오버라이딩 한 메소드 호출됨....");
	}

	@Override
	public void abstMethod() {
		System.out.println("InterProduct의 absMethod 오버라이딩 한 메소드 호출됨....");
		
	}

	/* static 메소드는 오버라이딩 할 수 없다.*/
//	@Override
//	public static void staticMethod() {}	

	/* default 메소드는 인터페이스에서만 작성 가능하다.*/
//	@Override
//	public default void defaultMethod() {}

	/* default 키워드를 제외하면 오버라이딩이 가능하다.*/
	public void defaultMethod() {
		System.out.println("Product 클래스의 defaultMethod 호출됨...");
	}
	
}	