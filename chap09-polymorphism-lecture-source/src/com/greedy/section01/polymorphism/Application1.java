package com.greedy.section01.polymorphism;

public class Application1 {

	public static void main(String[] args) {

		/*
		 * 다형성 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미한다. 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를
		 * 처리할 수 있기도 하고, 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
		 */

		/*
		 * 다형성의 장점
		 * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가한다. 
		 * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다. 
		 *    이러한 동일한 메세지를 수신 받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다. (다양한 기능을 하는데 있어서 관리해야 할 메세지 종류가 줄어드게 된다.) 
		 *    하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다. 
		 * 3. 확장성이 좋은 코드를 작성할 수 있다. 
		 * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다. */

//		System.out.println("Animal 생성 ---------------------");
//		Animal animal = new Animal();
//		animal.eat();
//		animal.run();
//		animal.cry();
//
//		System.out.println("Rabbit 생성 ----------------------");
//		Rabbit rabbit = new Rabbit();
//		rabbit.eat();
//		rabbit.run();
//		rabbit.cry();
//		rabbit.jump();
//
//		System.out.println("Tiger 생성 ------------------------");
//		Tiger tiger = new Tiger();
//		tiger.eat();
//		tiger.run();
//		tiger.cry();
//		tiger.bite();

		/* 다형성 적용 */
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();

//		Rabbit r  = new Animal(); 		//자식 타입의 인스턴스 변수는 부모 타입의 인스턴스 변수를 받지 못한다.	
//		Tiger t = new Animal();			// 객체가 생성되는 과정: 코드를 작성할 때 주소값이 발생하지 않고 실행을 시켜야 주소값을 반환한다.

		System.out.println("동적바인딩 확인 ------------------------");
		/*
		 * 동적 바인딩 
		 * 컴파일 당시에는 레퍼런스 변수 타입에 맞는 메소드와 연결되어 있다가 런타임 당시 실제 인스턴스가 가진 오버라이딩 된 메소드로
		 * 연결을 바꿔 동작하는 것을 의미한다.
		 * 호출을 하면 오버라이딩된 메소드가 우선권을 가지고 먼저 동작한다. 오버라이딩된 메소드가 없으면 부모 클래스의 메소드가 호출이됨.
		 */

		// 메소드 헤드부분(메모리) (code area) 연결되었다는 것을 바인딩되었다고 한다.

		a1.cry();		// 실제로 생성된 인스턴스 타입에 맞게 오버라이딩된 메소드를 우선적으로 실행하게 된다.
		a2.cry();

//		a1.jump();		//아직은 Animal타입이기 때문에 자식클래스가 가진 고유한 기능이 실행되지 않는다. 자식 클래스에 있는 고유한 기능(메소드)을 실행하려면 클래스 형변환을 해야한다. 
//		a2.bite();		// 타입형변환을 잘못하는 경우 컴파일 할 떄는 문제가 되지 않지만, 런타임할 때는 캐스트 익셉션 에러가 발생한다.

		System.out.println("클래스 타입 형변환 확인 ------------------------");

		((Rabbit) a1).jump(); // 클래스 형변환을 해야 자식 클래스가 갖고 있는 고유한 기능이 실행된다.
		((Tiger) a2).bite();  //  	

		System.out.println("instanceof 확인------------------------");
		System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger)); // instanceof 연산자를 사용해 객체 매개변수의 타입 확인
		System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));	
		System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
		System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));

		if(a1 instanceof Rabbit) {
			((Rabbit) a1).jump();
		}
		if(a1 instanceof Tiger) {
			((Tiger) a1).bite();
		}
	
		/* 클래스 형변환
		 * up-casting : 상위 타입으로 형변환
		 * down-casting : 하위 타입으로 형변환
		 * */
		
		
		Animal animal1 = (Animal) new Rabbit(); //up-casting 명시적 형변환 (Animal)생략가능 
		Animal animal2 = new Rabbit(); 			//up-casting 묵시적 형변환
		
		Rabbit rabbit1 = (Rabbit) animal1; 		//down-casting  명시적 형변환
//		Rabbit rabbit2 = animal2;				//down-casting 	묵시적 형변황 허용 안됨.
		
	}

}
