package com.greedy.section01.polymorphism;

public class Application2 {

	public static void main(String[] args) {

		/* 다형성과 객체배열*/ // 다형성과 객체 배열을 이용하면 여러 인스턴스를 하나의 레퍼런스 변수로 연속 처리할 수 있음.
		Animal[] animals = new Animal[5];
		
		animals[0] = new Rabbit();
		animals[1] = new Tiger();
		animals[2] = new Rabbit();
		animals[3] = new Tiger();
		animals[4] = new Rabbit();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry();
		}
		 
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Rabbit) {
				((Rabbit) animals[i]).jump();
			} else if(animals[i] instanceof Tiger) {
				((Tiger) animals[i]).bite();
			} else {
				System.out.println("호랑이나 토끼가 아니다.");
			}
		} 
		
	}

}
