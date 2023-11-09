package com.greedy.section01.generic;

public class Application {

	public static void main(String[] args) {

		/* 제네릭(generic)
		 * 사전적인 의미는 일반적인 이라는 의미를 가진다.
		 * 자바에서 제네릭이란 데이터의 타입을 일반화 시킨다는 의미를 가진다.
		 * 
		 * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
		 * 컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며,
		 * (잘못된 타입인 경우 컴파일 에러를 발생시킴)
		 * 반환값에 대한 타입 변환 및 타입검사에 들어가는 코드 생략이 가능해진다.
		 * (instance of 비교 및 다운캐스팅 작성 불필요)
		 * 
		 * JDK 1.5 버전부터 추가된 문법이다.
		 * */
		
		GenericTest<Integer> gt1 = new GenericTest<Integer>();	//인스턴스 생성할 떄 꺽새 안에 타입을 지정하면 컴파일러가 지정한 타입을 인식한다.
		
		gt1.setValue(new Integer(10));
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);	
		
		GenericTest<String> gt2 = new GenericTest<String>();
		
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		
		System.out.println(gt2.getValue().charAt(0));
		
		System.out.println(gt2.getValue() instanceof String);
		
	
//		GenericTest gt4 = new GenericTest();
//		if(gt4.getValue() instanceof String)		// 반환되는 타입이 object여서 타입이 맞는지 확인해야된다.
//		((String)gt4.getValue()).charAt(0);			// 타입이  object 클래스여서 해당 타입으로 다운캐스팅 해야된다.
		
		/* JDK 1.7부터 타입 선언 시 타입변수가 작성되면 타입 추론이 가능하기 때문에 생성자쪽 타입을 생략하고 사용할 수 있다.
		 * 단, 타입이 명시되지 않은 빈 다이아몬드 연산자는 사용해야 한다.
		 * */
		
		GenericTest<Double> gt3 = new GenericTest<>();	// 생성자 쪽 꺽새 부분 생략 
		gt3.setValue(0.5);
		System.out.println(gt3.getValue());	
		System.out.println(gt3.getValue() instanceof Double);
	
		GenericTest<String> gt4 = new GenericTest<>();
		GenericTest gt5 = new GenericTest();
		
		gt4.setValue("test");
		gt5.setValue("test");	// Object 타입이지만 다형성이 적용되서 gt4와 같은 타입으로 올 수 있음 
		
		System.out.println(gt4.getValue());	// 문자열
		System.out.println(gt5.getValue()); // Object
		
		System.out.println(gt4.getValue() instanceof String);
		System.out.println(gt5.getValue() instanceof String); 	// 
		
		if(gt4.getValue() instanceof String) {
			System.out.println(gt4.getValue().charAt(0));
		}
		
		if(gt5.getValue() instanceof String) {
			System.out.println(((String) gt5.getValue()).charAt(0));
		}
		
		
		
	}

}
