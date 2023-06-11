package com.greedy.section04.wrapper;

public class Application1 {

	public static void main(String[] args) {

		/* Wrapper 클래스
		 * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
		 * 이 때 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
		 * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스(Wrapper Class) 라고 한다.
		 * */
		
		/* 박싱(Boxing)과 언박싱(UnBoxing) // 박싱 : 감싼다.
		 * 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
		 * 래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
		 * */
		int intValue = 20;
		Integer boxingNumber1 = new Integer(intValue);			//인스턴스화- 박싱(Boxing) // 생성자 이용
		Integer boxingNumber2 = Integer.valueOf(intValue); 		//static 메소드 이용
		
		int unBoxingNumber1 = boxingNumber1.intValue();			//언박싱(unBoxing) 	//intValue() 이용
		
		/* 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
		 * JDK 1.5부터 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
		 * 
		 * */
		
		Integer boxingNumber3 = intValue;						//오토박싱
		int unBoxingNumber2 = boxingNumber3;					//오토 언박싱
		
		/* Wrapper 클래스 타입은 null값을 저장할 수 있는 것이 기본 자료형과 다르다. */
//		int i = null;											// 컴파일 에러 뜬다.
//		Integer integer = null; 								//
		
		
		/* Wrapper 클래스 값 비교*/
		int inum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		
		/* 기본 타입과 래퍼클래스 타입은 == 연산으로 비교 가능하다.*/
		System.out.println("int와 Integer 비교 : " + (inum == integerNum1));
		System.out.println("int와 Integer 비교 : " + (inum == integerNum2));
		
		System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum2));	// false 인스턴스 주소가 다르기 때문에 new연산자로 인스턴스를 생성해서 서로 저장된 공간의 주소값이 다르기 때문에
		System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum3));
		System.out.println("integer와 integer 비교 : " + (integerNum3 == integerNum4));	// true 리터럴 형태로 만들게 되면 equal 연산 가능
		
		/* 래퍼 클래스 타입의 인스턴스를 비교할 때는 equals()를 사용해야 한다. */
		System.out.println("equals() : " + (integerNum1.equals(integerNum2)));		 	// true 
		
		
		
	}

}
