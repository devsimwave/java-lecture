package com.greedy.section04.array_sort;

public class Application1 {

	public static void main(String[] args) {
		
		/* 변수의 두 값 바꾸기 */

		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		/* 배열 인덱스의 값 변경*/
		int[] arr = {2, 1, 3};
		
		int temp2;
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
	}

}
