package com.greedy.section03.array_copy;

public class Application4 {

	public static void main(String[] args) {

		/* 깊은 복사 활용
		 * */
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1.clone();
	
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += 10;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	
		/*향상된 for문 : jdk 1.5버전부터 추가된 문법
		 * 주의 ! : 향상된 for문은 배열에 인덱스별로 차례로 접근할 때는 편하게 사용할 수 있지만 값을 변경할 수 없다.
		 * 내부적으로 깊은 복사를 이용한다.
		 * */
		for(int i : arr2) {		
			i += 10;
		}
		
		for(int i = 0; i < arr2.length; i++) {		
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
	
//	for(자료형 변수명 : 배열명){
//		문장
//	}
	
	
}
