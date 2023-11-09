package com.greedy.section01.method;

public class Application6 {

	public static void main(String[] args) {

		/* 메소드 리턴 값 테스트 */
		System.out.println("main() 메소드 시작함...");

		Application6 app6 = new Application6();
		System.out.println(app6.testMethod()); // 출력문을 써줘야 return문에 반환값을 확인할 수 있다??

		String returnText = app6.testMethod();
		System.out.println(returnText);

		System.out.println("main() 메소드 종료됨...");

	}

	/**
	 * <pre>
	 * 문자열 형태의 반환값을 확인해보기 위한 용도의 메소드
	 * </pre>
	 * 
	 * @return hello world 라는 문자열을 반환한다.
	 */
	public String testMethod() {

		return "hello world";
	}
}
