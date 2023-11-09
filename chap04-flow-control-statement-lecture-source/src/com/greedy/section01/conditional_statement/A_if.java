package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class A_if {

	public void testSimpleIfStatement() {

		/*
		 * [if문의 표현식] if(조건식) { 조건식이 true일 때 실행할 명령문; }
		 */

		/*
		 * 키보드로 정수를 하나 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고, 짝수가 아니면 출력하지 않는 프로그램을
		 * 만들어보세요
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}

		System.out.println("프로그램을 종료합니다.");
	}

	public void testNestedIfstatement() {

		/*
		 * 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
		 * 둘 중 어느 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자 단, 조건과 상관 없이 프로그램이 종료될 때
		 * "프로그램을 종료합니다."라고 출력 되도록 한다.
		 */

		Scanner sc1 = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc1.nextInt();

		if (num1 > 0) {
			if (num1 % 2 == 0) {
				System.out.println("양수이면서 정수 입니다.");
			}
		}

		System.out.println("프로그램을 종료합니다.");
	}

}
