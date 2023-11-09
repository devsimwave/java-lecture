package com.greedy.section01.method;

public class Application5 {

	public static void main(String[] args) {
		
		/* 메소드 리턴 테스트 */
		/* 모든 메소드 내부에는 return; 이 존재한다.
		 * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가를 해준다.	jdk는 컴파일러가 포함되고 jre는 실행 목적만 있기 때문에 컴파일러가 포함 되지 않는다.(jdk에 jre가 포함되어있음.)
		 * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
		 * */
		System.out.println("main() 메소드 시작함...");
		
		Application5 app5 = new Application5();
		app5.testMethod();
		
		System.out.println("main() 메소드 종료됨...");
		
		
		
	}

	public void testMethod() {
		System.out.println("testMethod() 호출함...");

		/* 컴파일러에 의해 자동으로 추가되는 구문이다.
		 * 가장 마지막에 자겅해야 하고, 마지막에 작성되지 않을 시 컴파일 에러를 발생시킨다.*/
		return;
		
//		System.out.println("test");	 		// return을 전에 명시해줬기 때문에 컴파일 에러가 뜬다.
	}

}
