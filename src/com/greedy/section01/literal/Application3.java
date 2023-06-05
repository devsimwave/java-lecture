package com.greedy.section01.literal;

public class Application3 {

	public static void main(String[] args) {
		
		/* 문자열 합치기 테스트*/
		System.out.println("===== 두 개의 문자열 합치기 ===== ");
		System.out.println(9 + 9);		// 18
		System.out.println("9" + 9);	//문자열 99가 나온다.
		System.out.println(9 + "9");	//같은 결과가 나온다.
		System.out.println("9" + "9");	//같은 결과가 나온다.
		
		System.out.println("===== 세 개의 문자열 합치기 =====");	//같은 결과가 나온다.
		System.out.println(9 + 9 + "9");	//왼쪽에서 오른쪽 방향으로 연산 순서가 시작된다(기억하기). 189가 나온다.
		System.out.println(9 + "9" + 9); 	//999
		System.out.println("9" + 9 + 9); 	//999
		
		System.out.println("9" + (9 + 9)); 	//괄호는 최우선 연산자기 때문에(기억하기)  문자열 918이 나온다.
		
		/* 문자열 합치기 응용 */
		System.out.println("===== 10과 20의 사칙연산 결과 =====");
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(10 / 20);
		System.out.println(10 % 20);
		
		System.out.println("===== 10과 20의 사칙 연산 결과 보기 좋게 출력 =====");
		System.out.println("10과 20의 합 : " + (10 + 20));	
		System.out.println("10과 20의 차 : " + (10 - 20));	
		System.out.println("10과 20의 곱 : " + (10 * 20));	
		System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));	
		System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));	
		
		
		
	}

}
