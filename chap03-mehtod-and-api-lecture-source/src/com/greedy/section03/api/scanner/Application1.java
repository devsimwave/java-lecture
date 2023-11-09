package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* java.util.scanner를 이용한 다양한 자료형 값 입력 받기*/
		
		/* 1. Scanner 객체 생성
		 * 1-1. 풀 클래스 이름을 이용해 객체 생성*/
//		java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
		
		/* 1-2. java.lang 패키지는 패키지 이름 생략 가능*/
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		/* 1-3. 다른 패키지에 있는 클래스 사용 시 패키지명 생략을 위해 사용하는 import 구문 이용*/
		Scanner sc = new Scanner(System.in);
		
		/* 2. 자료형별 값 입력받기
		 * 2-1. 문자열 입력 받기
		 * nextLine() : 입력받은 값을 문자열로 반환해줌*/
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("입력하신 이름은 " + name + "입니다.");
		
		/* 2-2. 정수형 값 입력 받기
		 * nextInt() :  입력받은 값을 int형으로 반환해줌*/
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("입력하신 나이는 " + age + "입니다");
		
		System.out.print("금액을 입력해주세요 : ");
		long money = sc.nextLong();
		System.out.println("입력하신 금액은 " + money + "입니다");
		
		/* 2-3. 실수 형태의 값 입력 받기
		 * nextFloat() : 입력 받은 값을 float 형으로 반환한다.
		 * nextDouble() : 입력 받은 값을 double 형으로 반환한다.
		 * */
		System.out.print("키를 입력해주세요 : ");
		float height = sc.nextFloat();
		System.out.println("입력하신 키는  " + height + "cm 입니다.");
		
		System.out.print("원하는 실수 값을 입력하세요 : ");
		double number = sc.nextDouble();
		System.out.println("입력하신 실수는 " + number + "입니다. ");
		
		/* 2-4. 논리형 값 입력받기
		 * nextBoolean() : 입력 받은 값을  boolean형으로 반환한다.
		 * true or false 외의 값을 입력할 수 없다.*/
		System.out.print("참과 거짓 주엥 한 가지를 true or false로 입력해주세요 : ");
		boolean isTrue = sc.hasNextBoolean();
		System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");
		
		/* 2-5. 문자형 값 입력받기*/
		
		sc.nextLine();
		System.out.print("아무 문자나 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);		// 문자형은 간접적으로 입력을 해야한다.
		System.out.println("입력하신 문자는 " + ch + "입니다.");
	}

}
