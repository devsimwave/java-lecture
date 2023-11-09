package com.greedy.section06.statickeyword;

import static com.greedy.section06.statickeyword.StaticMethodTest.staticMethod;

public class Application {

	public static void main(String[] args) {

		/* static 키워드
		 * static : 정적 메모리 영역에 프로그램이 start될 때 할당을 하는 키워드이다.
		 * 			인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
		 * 			여러 인스턴스가 공유해서 사용할 목적의 공간이다.
		 * 			하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야 할 방식이다.
		 * 			명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하는 것이 좋다.
		 * 			의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때이다.
		 * */
		
		StaticFieldTest stf1 = new StaticFieldTest();
		
		System.out.println("non-static field : " + stf1.getNonStaticCount());
		System.out.println("static field : " + stf1.getStaticCount());
		
		stf1.increaseNonstaticCount();
		stf1.increasStaticCount();
		
		System.out.println("non-static field : " + stf1.getNonStaticCount());
		System.out.println("static field : " + stf1.getStaticCount());
		
		StaticFieldTest stf2 = new StaticFieldTest();
		
		System.out.println("non-static field : " + stf2.getNonStaticCount());
		System.out.println("static field : " + stf2.getStaticCount());
	
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		/* 권장하지 않음
		 * static 메소드 목적 자체는 정적 영역에 두고 인스턴스 생성 없이 메소드를 호출할 목적이기 때문*/
//		smt.staticMethod();
		
		StaticMethodTest.staticMethod();
		
		
	}

}
