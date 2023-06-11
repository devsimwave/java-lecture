package com.greedy.section03.array_copy;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {

		/* 깊은 복사 방법 4가지
		 * 1. for문을 이용한 동일한 인덱스의 값 복사
		 * 2. Object클래스의 clone()을 이용한 복사			// 복사하기 전에 있는 배열하고 복사한 배열하고 딱 같은 길이의 배열만 만들 수 있는 특징을 갖고 있다.
		 * 3. System클래스의 arraycopy()를 이용한 복사		// 성능면에서는 가장 빠름
		 * 4. Arrays클래스의 copyOf()를 이용한 복사			// 실질적으로 더 많이 사용함.
		 * */
	
		int[] originArr = new int[] {1, 2, 3, 4, 5};	//원본 배열
	
		print(originArr);
		
		/* 1. for문을 이용한 동일한 인덱스 값 복사*/
	
		int[] copyArr1 = new int[10];
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
	
		print(copyArr1);
		
		/* 2. Object클래스의 clone()을 이용한 복사*/
		int[] copyArr2 = originArr.clone();			// 배열 길이를 변경해서 사용 불가.
		
		print(copyArr2);
		
		/* 3. System 클래스의 arraycopy()를  이용한 복사*/
		int[] copyArr3 = new int[10];			
		
		/* 원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이)의 의미이다.*/
		System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
		
		print(copyArr3);
		
		/* 4. Arrays 클래스의 copyOf()를 이용한 복사
		 */
		
		int[] copyArr4 = Arrays.copyOf(originArr, 7);
		
		
		print(copyArr4);
	}

	public static void print(int[] iarr) {
		System.out.println("iarr의 hashCode : " + iarr.hashCode());
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
		
	}



}
