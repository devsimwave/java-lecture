package com.greedy.section01.method;

/**문서화 주석
 * <pre>
 * Class : Application4
 * comment : 여러 개의 전달인자와 매개변수를 이용한 메소드 호출
 * History
 * 2021/05/12 (김진호) 처음 작성함
 * </pre> 
 * @author LIMSOOYOUNG
 * @version 1.0.0
 */
public class Application4 {

	public static void main(String[] args) {
		
		/* 여러 개의 전달 인자를 이용한 메소드 호출 테스트
		 * 1. 여러 개의 매개변수를 가진 메소드 호출
		 * */
		Application4 app4 = new Application4();
		app4.testMethod("홍길동", 20, '남');		
//		app4.testMethod(20, "유관순", '여');  		// 값의 갯수는 맞지만 순서가 다르게 전달되면 호출하지 못한다.
		
		/* 2. 변수에 저장된 값을 전달하며 호출할 수 있다.*/
		String name = "유관순";
		int age = 20;
		char gender = '여';
		app4.testMethod(name, age, gender);
	}
	
	/**
	 * <pre>
	 * 이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공해줌.
	 * </pre>
	 * @param name 출력할 이름 전달해주세요.
	 * @param age 출력할 나이를 전달해주세요.
	 * @param char 출력할 성별을 전달해주세요. 성별은 변겨오디지 않을 것을 보장합니다.
	 */
	public void testMethod(String name, int age, final char gender) {	// 상수를 선언할 때 대문자로 선언해야하지만, 매개변수에서는 적용안해도됨.
		
		/* 매개변수는 일종의 지역변수이다.*/
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
	}
	
}
