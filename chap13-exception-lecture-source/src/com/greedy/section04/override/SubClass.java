package com.greedy.section04.override;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
	
	/* 예외처리 없이 오버라이딩 할 수 있다.*/
//	@Override
//	public void method() {}
	
	/* 동일한 예외를 던지는 것은 오버라이딩이 성립된다.*/
//	@Override
//	public void method() throws IOException {}
	
	/* 부모의 예외처리 클래스보다 상위 타입의 예외로는 오버라이딩 할 수 없다.*/
//	@Override
//	public void method() throws Exception {}
	
	/* 부모의 예외클래스 보다 더 하위에 있는 예외 (즉, 더 구체적인 예외 상황)인 경우 오버라이딩 할 수 있다.*/
	@Override
	public void method() throws FileNotFoundException{}
}
