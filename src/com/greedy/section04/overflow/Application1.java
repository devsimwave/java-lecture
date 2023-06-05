package com.greedy.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		
		/* 오버플로우 */
		/* 자료형 별 값의 최대 범위를 벗어나는 경우
		 * 발생한 carry를 버림 처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
		 * */
	
		byte num1 = 127;
		System.out.println("num1 : " + num1);
	
		num1++;
		System.out.println("num1 : " + num1);
		
		/* 언더플로우
		 * 오버 플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.*/
		byte num2 = -128;
		System.out.println("num2 : " + num2);
		
		num2--;
		
		System.out.println("num2 underflow : " + num2);	//논리적에러
		
		int firstNum = 1000000;
		int secondNum = 700000;
		
		int multi = firstNum * secondNum;
		
		System.out.println("firstNum * secondNum = " + multi);
		
		/* 해결 방법 */
		long longMulti = firstNum * secondNum;
		
		System.out.println("longMulti : " + longMulti); 	// 이미 연산할 때 부터 오버플로우가 나와서 값이 똑같이 나온다. 더 큰 자료형이더라도..
		
		long result = (long) firstNum * secondNum;
		System.out.println("result : " + result);
		
		byte b = 127;
		System.out.println(b);
		b++;
		System.out.println(b);
		++b;
		System.out.println(b);
	}

}
