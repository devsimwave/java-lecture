package com.greedy.section02.demensional_array;

public class Application4 {

	public static void main(String[] args) {

		/* 선언과 할당을 하며 초기화
		 * 정변 배열 
		 * */
		int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9 ,10}, {11, 12, 13, 14, 15}};
		
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
	
		/* 가변 배열*/
		
		int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
		
		for(int i = 0; i < iarr2.length; i++) {
			for(int j = 0; j < iarr2[i].length; j++) {
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
	
		/* 미리 할당한 배열을 이용할 수 있다.*/
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};	
	
		int[][] arr3 = {arr1, arr2};
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	}
}
