package com.greedy.section02.demensional_array;

public class Application1 {

	public static void main(String[] args) {
		
		/* 다차원 배열
		 * 다차원 배열은 2차원 이상의 배열을 의미한다.
		 * 배열의 인덱스마다 또 다른 배열의 주소를 보관한느 배열을 의미한다.
		 * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
		 * */

		/* 1. 배열의 주소를 보관할 레퍼런스 변수 선언(선언 : stack이라는 곳에 공간을 만든다.)*/
		int[][] iarr1;
		int iarr2[][];
		int[] iarr3[];
	
		/* 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap) */
//		iarr1 = new int[][];		//크기를 지정하지 않으면 에러 발생함
//		iarrq = new int[][4];		//주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 에러 발생함
		iarr1 = new int[3][];		//앞에 있는 것이 주소를 저장, 뒤에 있는것이 값을 저장
		
		/* 3. 주소를 관리하는 배열이 인덱스마다 배열을 할당한다. (heap)*/
		iarr1[0] = new int[5];		// 관리하는 배열의 길이가 같은 것이 정변 배열 길이가 다른 것이 가변배열
		iarr1[1] = new int[5];
		iarr1[2] = new int[5];
		
		/* 2, 3을 동시에 진행*/
		iarr2 = new int[3][5];
		
		/* 4. 각 배열의 인덱스에 차례로 접근해서 값 대입 혹은 호출하여 사용한다.*/
		for(int i = 0; i < iarr1[0].length; i++) {
			System.out.print(iarr1[0][i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < iarr1[1].length; i++) {
			System.out.print(iarr1[1][i] + " ");
		}
		System.out.println();
	
		for(int i = 0; i < iarr1[2].length; i++) {
			System.out.print(iarr1[2][i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < iarr1.length; i++) {
			
			for(int j = 0; j < iarr1[i].length; j++) {
				System.out.print(iarr1[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
