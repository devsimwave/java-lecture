package com.greedy.section03.interfaceimplements;

public interface InterProduct extends java.io.Serializable{
	
	/* 클래스에서 interface를 상속 받아 구현할 시 implements 키워드를 이용한다.
	 * 이 때 인터페이스는 다중 상속이 가능하다.
	 * 단, 인터페이스에서 인터페이스를 상속받아 구현할 시 extends 키워드를 이용한다.
	 * */
	
	/* 인터페이스는 상수 필드만 작성이 가능하다.
	 * 상수 필드는 반드시 명시적으로 초기값을 지정해야 한다.*/
	public static final int MAX_NUM = 100;

	/* 상수 필드만 사용할 수 있기 때문에 모든 필드는 묵시적으로 public static final이다.*/
	int MIN_NUM = 10;
	
	/* 인터페이스는 생성자를 가질 수 없다.*/
//	public InterProdcut() {}

	/* 인터페이스는 구현부가 없는 non-static 메소드를 가질 수 없다.*/
//	public void nonStaticMehthod() {}

	/* 인터페이스는 추상 메소드만 작성이 가능하다.*/
	public abstract void nonStaticMethod();
	
	/* 인터페이스에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다.*/
	void abstMethod(); 				// public abstract라 생각한다. 인터페이스에 있는 메소드를 오버라이딩 하려면 접근제한자가  public이여야 한다.
	
	/* 하지만 static 메소드는 작성이 가능하다. (JDK 1.8부터 추가된 기능)*/
	public static void staticMethod() {
		System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
	}
	
	/* 또한 default 키워드를 사용하면 non-static 메소드도 작성이 가능하다. (JDK 1.8부터 추가된 기능)*/
	public default void defaultMethod() {
		System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
	}
		



}
