package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		 
		/*Scanner의 nextLine()과 next()
		 * nextLine() : 공백을 포함한 한 줄을 입력받기 위해 사용함. 개행문자(줄바꿈)전 까지를 읽어서 문자열로 반환한다. (공백문자 포함)
		 * next() : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환한다. (공백문자 포함하지 않음)
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		/* 1. nextLine() */
		System.out.print("인사말을 입력해주세요 : ");
		String greeting1 = sc.nextLine();
	
		System.out.println(greeting1);
		
		/* 2. next()*/
		System.out.print("인사말을 입력해주세요 : ");
		String greeting2 = sc.next();
		
		System.out.println(greeting2);
		
		sc.close();
	
	
	}

}
