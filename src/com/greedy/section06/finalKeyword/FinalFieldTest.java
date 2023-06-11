package com.greedy.section06.finalKeyword;

public class FinalFieldTest {

	/* final 키워드
	 * final 키워드를 사용할 수 있는 위치는 다양하다. 작성 위치별로 의미는 다르지만 결국 변경 불가의 의미를 가진다.
	 * 1. 지역변수 : 초기화 이후 값 변경 불가
	 * 2. 매개변수 : 호출시 전달한 인자 변경 불가
	 * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
	 * 4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
	 * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
	 * 6. static 메소드 : 메소드 재작성(overriding) 불가
	 * 7. 클래스 : 상속 불가
	 * */

	/* final 키워드는 변경 불가의 의미를 가지기 때문에 인스턴스가 생성되면 0이라는 값이 초기값으로 설정되고
	 * 이후에는 변경이 불가능해진다.
	 * 따라서 선언하면서 바로 초기값을 넣어 주어야 한다.
	 * */
	/* 1. 선언과 동시에 초기화*/
	private final int NON_STATIC_NUM = 1;

	/* 2. 생성자를 이용해서 초기화 함*/
	private final String NON_STATIC_NAME;
	
	public FinalFieldTest(String nonStaticName) {
		this.NON_STATIC_NAME = nonStaticName;
	}

	/* static 필드도 선언과 동시에 초기화를 해주어야 한다.*/
	private static final int STATIC_NUM = 1;
	
//	private static final double STATIC_DOUBLE;
	
	/* static 필드는 생성자로 초기화가 불가능하다.*/
//	public FinalFieldTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;
//	}


}
