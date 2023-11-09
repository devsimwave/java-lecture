package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class D_switch {

	public void testSimpleSwitchStatement() {
		/*
		 * [switch문 표현식] switch(비교할변수) { case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break; case
		 * 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break; default : case에 모두 해당하지 않는 경우 실행할 구문;
		 * break; }
		 * 
		 * 문자열 비교는 jdk 1.7이상부터 가능하다.
		 * 
		 */

		/*
		 * 정수 두 개와 연산 기호 문자를 입력 받아서 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력 (+, -, *, /, %) : ");
		char op = sc.next().charAt(0);

		int result = 0;

		switch (op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		case '%':
			result = first % second;
			break;
		/*
		 * default 문은 생략 가능하지만 생갹 하는 경우 주석으로 생략 이유를 작성해 주는 것이 좋다. 산술 연산 외에 다른 문자에 대한 처리는
		 * 생략하였음
		 * 
		 */

		}

		System.out.println(first + " " + op + " " + second + " = " + result);

	}

	public void testSwitchVendingMachine() {

		System.out.println("===== greedy vending machine =====");
		System.out.println("===== 사이다   콜라    환타    바카스    핫식스 ====");
		System.out.println("=============================");
		System.out.print("음료를 선택해주세요 : ");

		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.nextLine();

//		System.out.println(selectedDrink);
//		
//		System.out.println("사이다" == "사이다");
//		System.out.println(selectedDrink == "사이다");
//		System.out.println("사이다".equals(selectedDrink));
//		System.out.println(selectedDrink.equals("사이다"));

		int price = 0;

		switch (selectedDrink) {
		case "사이다":
			System.out.println("사이다를 선택하셨습니다.");
			price = 500;
			break;
		case "콜라":
			System.out.println("콜라를 선택하셨습니다.");
			price = 600;
			break;
		case "환타":
			System.out.println("환타를 선택하셨습니다.");
			price = 700;
			break;
		case "바카스":
			System.out.println("바카스를 선택하셨습니다.");
			price = 2000;
			break;
		case "핫식스":
			System.out.println("핫식스를 선택하셨습니다.");
			price = 10000;
			break;

		}

		System.out.println(price + "원을 투입해주세요!");
	}
}
