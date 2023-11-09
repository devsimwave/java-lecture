package com.greedy.section02.demensional_array;

public class Application2 {

	public static void main(String[] args) {
		
		/* 2차원 정변 배열의 선언 및 할당 후 값 대입하여 출력*/
		
		/* 1. 배열의 선언 및 할당
		 * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이]*/
		int[][] iarr = new int[3][5]; 		// 정변 배열만 한번에 선언 가능.
		
		/* 2. 각 배열의 인덱스에 접근해서 값 대입 후 출력*/
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		iarr[1][0] = 6;
		iarr[1][1] = 7;
		iarr[1][2] = 8;
		iarr[1][3] = 9;
		iarr[1][4] = 10;

		iarr[2][0] = 11;
		iarr[2][1] = 12;
		iarr[2][2] = 13;
		iarr[2][3] = 14;
		iarr[2][4] = 15;
		
		System.out.print(iarr[0][0] + " ");
		System.out.print(iarr[0][1] + " ");
		System.out.print(iarr[0][2] + " ");
		System.out.print(iarr[0][3] + " ");
		System.out.print(iarr[0][4] + " ");
		
		System.out.println();
		
		System.out.print(iarr[1][0] + " ");
		System.out.print(iarr[1][1] + " ");
		System.out.print(iarr[1][2] + " ");
		System.out.print(iarr[1][3] + " ");
		System.out.print(iarr[1][4] + " ");
		
		System.out.println();
		
		System.out.print(iarr[2][0] + " ");
		System.out.print(iarr[2][1] + " ");
		System.out.print(iarr[2][2] + " ");
		System.out.print(iarr[2][3] + " ");
		System.out.print(iarr[2][4] + " ");
		
		System.out.println();
		
		/* 반복문 이용*/
		int value = 1;
		for(int i = 0; i < iarr.length; i++) {
			
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = value++;
			}
		}
		
		for(int i = 0; i < iarr.length; i++) {
			
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
