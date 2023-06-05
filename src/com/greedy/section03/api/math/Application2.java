package com.greedy.section03.api.math;


public class Application2 {

	public static void main(String[] args) {
		/* 원하는 범위의 난수를 구하는 공식
		  (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값  */  
		
		/* 0 ~ 9 까지의 난수 발생 */
		int random1 = (int) (Math.random() * 10);
		System.out.println("0부터 9사이의 난수 : " + random1);

		/* 1 ~ 10까지의 난수 발생 */
		int random2 = (int) (Math.random() * 10) + 1;
		System.out.println("1부터 10까지의 난수 : " + random2);

		/* 10 ~ 15 까지의 난수 발생 */
		int random3 = (int) (Math.random() * 6) + 10; 
		System.out.println("10부터 15까지의 난수 :" + random3);
		
		/* -128 ~ 127 까지의 난수 발생 */
//		int random4 = (int) (Math.random() * 256) + (-128);
		int random4 = (int) (Math.random() * 256) -128;
		System.out.println("-128부터 127까지의 난수 :" + random4);
		 
		
	}

}
