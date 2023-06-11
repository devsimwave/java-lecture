package com.greedy.section07.kindsofvariable;

public class KindsOfVariable {		//클래스 영역의 시작

	/* 클래스 영역 안에 작성하는 변수를 필드라고 한다.
	 * 필드 == 멤버 변수(클래스가 가지는 멤버) == 전역 변수 (클래스 영역 전역에서 사용할 수 있는 변수)
	 * non-static field == 인스턴스 변수(인스턴스가 생성된 이후에 사용 가능한 변수라는 의미)
	 * static field == 정적필드 (정적(static)영역에 생성되는 변수) == 클래스 변수 (정적 메모리 영역을 클래스 영역이라고도 한다.)
	 * */
	
	private int globalNum;
	private static int staticNum;
	
	public void testMethod(int num) {
		
		System.out.println(globalNum);
		System.out.println(staticNum);
		
		/* 지역변수는 반드시 초기화가 되어 있어야 한다. */
		int localNum = 0;
		
		System.out.println(localNum);
		
		System.out.println(num);
	}
	
	public void testMethod2() {
		
		System.out.println(globalNum);
		System.out.println(staticNum);
		
//		System.out.println(localNum);
//		System.out.println(num);
		
	}
	
}	//클래스 영역의 끝

