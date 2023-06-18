package com.greedy.section01.generic;

public class GenericTest<T> {	// 관례상 대문자로 작성 다른 문자로 써도 상관없다. 나열 연산자를 써도 상관없다. 

	/* 다이아몬드 연산자 내부에 작성한 T는 타입변수라고 부른다.*/
	
	private T value; 	// 아직 결정되지 않은 상태

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}


}
