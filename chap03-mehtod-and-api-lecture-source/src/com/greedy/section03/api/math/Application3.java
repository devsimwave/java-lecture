package com.greedy.section03.api.math;

import java.util.Random;

public class Application3 {

	public static void main(String[] args) {
		 /* java.util.Random 클래스
		  * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
		  * nextInt(int bound(범위)) : 0부터 매개변수로 전달 받은 정수 범위 까지의 난수를 발생시켜 정수형으로 반환*/
	
		/* 원하는 범위의 난수를 구하는 공식
		 * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
		 * */
		Random random = new Random();
		
		/* 0 부터 9 까지의 난수 발생*/
		int randomNumber1 = random.nextInt(10);
		System.out.println("0부터 9까지의 난수 : " + randomNumber1);
		
		/* 1부터 10까지의 난수 발생*/
		int randomNumber2 = random.nextInt(10) + 1;
		System.out.println("1부터 10까지의 난수 : " + randomNumber2);
		
		
		/* 20부터 45까지의 난수 생성*/
		int randomNumber3 = random.nextInt(26) + 20;
		System.out.println("20부터 45까지의 난수 : " + randomNumber3);
		
		
		/* -128부터 127까지의 난수 생성*/
//		int randomNumber4 = random.nextInt(256) - 128;
		int randomNumber4 = new Random().nextInt(256) - 128;
		
		System.out.println("-128부터 127까지의 난수 : " + randomNumber4);
	}

}
