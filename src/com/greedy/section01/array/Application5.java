package com.greedy.section01.array;

public class Application5 {

	public static void main(String[] args) {

		/* 랜덤한 트럼프 카드 한 장을 출력하는 프로그램 */
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "JACK", "QUEEN", "KING", "ACE"};
		
		int randomShapeIndex = (int) (Math.random() * shapes.length);
		int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);
	
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + "카드 입니다.");
	
	}

}
