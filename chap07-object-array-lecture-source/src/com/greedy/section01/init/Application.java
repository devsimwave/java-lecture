package com.greedy.section01.init;

public class Application {

	public static void main(String[] args) {
		
		/* 객체 배열
		 * 레퍼런스 변수에 대한 배열이다.
		 * (레퍼런스 변수를 한번에 묶는것)
		 * 
		 * */
		
		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람브로기니", 500);
		Car car3 = new Car("롤스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 500);
		
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
	

		Car[] carArray = new Car[5];
	
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("롤스로이스", 300);
		carArray[3] = new Car("부기티", 300);
		carArray[4] = new Car("포터", 500);
		
		
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println("carArray[" + i + "] : " + carArray[i]);
			carArray[i].driveMaxSpeed();	//null 값에 참조연산을 하면 nullpointerexception
		}
		
	
		/* 객체 배열의 할당과 동시에 초기화*/
		
		Car[] carArray2 = {
				new Car("페라리", 300)
				, new Car("람로르기니", 350)
				, new Car("롤스로이스", 250)
				, new Car("부가티", 250)
				, new Car("포터", 250)
				};
	
		for(Car c : carArray2)
			c.driveMaxSpeed();
		
	}

	
	
}
