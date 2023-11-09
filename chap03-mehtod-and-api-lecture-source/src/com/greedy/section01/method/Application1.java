package com.greedy.section01.method;

public class Application1 { 	// 클래스: 여러개의 메소드를 작성할 수 있는  메소드의 집합

	public static void main(String[] args) {	
		
		/*메소드란
		 *메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 **/
		
		System.out.println("main() 시작점...");
		
		/* non-static 메소드 호출방법
		 * 클래스명 사용할이름 = new 클래스명();
		 * 사용할이름.메소드명();
		 * */
		Application1 app1 = new Application1();
		app1.methodA();
		
		System.out.println("main() 종료됨...");
		
	}

	public void methodA() { 					// 메인 메소드가 아닌 메소드에서 더이상 처리할 구문이 없으면 여기서 끝나는게 아닌 메인메소드로 돌아가 프로그램이 종료됨.
		System.out.println("methodA() 호출함..."); 	//호출을 해야 실행됨.
	
		methodB();				//non static
		
		System.out.println("methodA() 종료됨...");
	
	}
	
	public void methodB() {
		System.out.println("methodB() 호출함...");
		
		methodC();
		
		System.out.println("methodB() 종료됨...");
	}

	public void methodC() {
		System.out.println("methodC() 호출함");
	
		System.out.println("methodC() 종료됨");
	}
}
