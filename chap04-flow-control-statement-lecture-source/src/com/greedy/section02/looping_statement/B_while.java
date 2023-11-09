package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class B_while {

	public void testSimpleWhileStatement() {

		/*
		 * while문의 표현식 초기식; while(조건식) { 조건을 만족하는 경우 숭행할 구문(반복할 구문) 증감식; }
		 */

//		int i = 1;
//		for(; i <= 10;) {
//			System.out.println(i);
//			i++;
//		}

		int i = 1;
		while (i <= 10) {

			System.out.println("hello world");

			i++;
		}
		
	
	}

	public void testWhileExample() {
		
		/* 입력한 문자열의 인덱스를 이용하여 문자열 하나씩 출력해보기*/
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println(str.length());  					// str.length() 메소드의 역할 알아두기
	
		System.out.println("======== for문 =======");
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			System.out.println(i + " : " + ch);
		}
	
		System.out.println("======== while문 =======");
		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);

			System.out.println(i + " : " + ch);
			
			i++;
		}
	
	}

	public void testWhileExample2() {
		
		/* 정수를 하나 입력 1부터 입력받은 정수 까지의 합계를 구하세요.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요  : ");
		int num = sc.nextInt();
		
		int sum =  0;
		
		int i = 1;
		while(i <= num) {
			sum += i;
			i++;
			
		}
		
		System.out.println("1부터 입력 받은 정수" + num + "까지 합은" + sum + "입니다.");
	
	}
	
	public void testWhilExample3() {
		
		/* while문을 이용하여 구구단 2단부터 9단까지 출력*/
		
		int dan = 2;
		
		while(dan <= 9) {
			
			int su = 1;
			while(su <= 9) {
		
				System.out.println(dan + " * " + su + " = " + (dan * su));
				
				su++;
			}
			System.out.println();
			
			dan++;

		}
		
	}
	
}
