package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class C_doWhile {

	public void testSimpleDoWhileStatement() {

		/*
		 * do-while문의 표현식 초기식; do { 1회차에는 무조건 실행하고, 이후에는 조건식을 만족하는 경우 수행할 구문(반복할 구문);
		 * 증감식; } while(조건식);
		 */

		do {
			System.out.println("최초 한번 동작함");
		} while (false);
		
		System.out.println("반복문 종료 확인");
	
	}

	public void testDoWhileExample1() {
		/* 키보드로 문자열을 입력 받아 반복적으로 출력하는 프로그램
		 * 단, exit라는 문자열이 입력되면 반복문을 종료한다.
		 * */
		Scanner sc = new Scanner(System.in);
		String str = " ";
		
		do {
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine();
			System.out.println(str);
			
		}while (!str.equals("exit"));			//str.equals
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	
	
}
