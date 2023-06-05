package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class A_nestedFor {
	
	public void printGugudanFromTwoToNine() {
		
		
		/*구구단 2단부터 9단까지 출력*/
		for(int dan = 2; dan < 10; dan++) {
//			for(int su = 1; su <= 9; su++) {
//				System.out.println(dan + " * " + su + " = " + (dan * su));
//			}
			
			printGugudanOF(dan);
			System.out.println();
		}
	
	}

	public void printGugudanOF(int dan) {
		
		for(int su = 1; su <= 9; su++) {
			System.out.println(dan + " * " + su + " = " + (dan * su));
		}
	}
	
	
	public void printTime() {
		
		for(int hour = 0; hour < 24; hour++) {
			
			for(int min = 0; min < 60; min++) {
				System.out.println(hour + "시" + min + "분");
			}
			System.out.println();
		
		}
		
	}

	public void printStarTInputRowTimes() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printTriangleStars() {
		
		/* 입력받은 줄 수만큼 삼각형 모양으로 *출력
		 * 입력 예시
		 * 출력할 줄 수를 입력하세요 : 6
		 * 
		 * 출력 예시
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  *******/
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int row1 = sc.nextInt();
		
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	


}
